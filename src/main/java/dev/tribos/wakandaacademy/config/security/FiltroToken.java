package dev.tribos.wakandaacademy.config.security;


import java.io.IOException;
import java.util.Optional;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import dev.tribos.wakandaacademy.autenticacao.util.ValidaConteudoAuthorizationHeader;
import dev.tribos.wakandaacademy.config.security.service.TokenService;
import dev.tribos.wakandaacademy.credencial.application.service.CredencialService;
import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.handler.ApiException;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class FiltroToken extends OncePerRequestFilter {

    private TokenService tokenService;
    private CredencialService credencialService;

    public FiltroToken(TokenService tokenService, CredencialService credencialService) {
        this.tokenService = tokenService;
        this.credencialService = credencialService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        log.info("[inicio] Filtro - filtrando requisicao");
        String token = recuperaToken(request);
        autenticaCliente(token);
        log.info("[finaliza] Filtro - filtrando requisicao");
        filterChain.doFilter(request, response);
    }

    private void autenticaCliente(String token) {
        log.info("[inicio] autenticacaoCliente - utilizando token válido para autenticar o usuário");
        Credencial credencial = recuperaUsuario(token);
        var authenticationToken = new UsernamePasswordAuthenticationToken(credencial, null, credencial.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        log.info("[finaliza] autenticacaoCliente - utilizando token válido para autenticar o usuário");
    }

    private Credencial recuperaUsuario(String token) {
        var id = tokenService.getId(token)
                                    .orElseThrow(()-> ApiException.throwApiException(HttpStatus.FORBIDDEN,"O Token enviado está inválido. Tente novamente."));
        return credencialService.buscaCredencialPorId(id);
    }

    private String recuperaToken(HttpServletRequest requestOpt) {
        log.info("[inicio] recuperaToken - extraindo o token dos cabecalhos da requisicao");
        var AuthorizationHeaderValueOpt = Optional.ofNullable(recuperaValorAuthorizationHeader(requestOpt));
        String AuthorizationHeaderValue = AuthorizationHeaderValueOpt.filter(new ValidaConteudoAuthorizationHeader())
                .orElseThrow(() -> ApiException.throwApiException(HttpStatus.UNAUTHORIZED, "Token inválido!"));
        log.info("[finaliza] recuperaToken - extraindo o token dos cabecalhos da requisicao");
        return AuthorizationHeaderValue.substring(7, AuthorizationHeaderValue.length());
    }

    private String recuperaValorAuthorizationHeader(HttpServletRequest request) {
        return Optional.ofNullable(request.getHeader("Authorization"))
                .orElseThrow(() -> ApiException.throwApiException(HttpStatus.FORBIDDEN, "Token não está presente na requisição!"));
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        String path = request.getRequestURI();
        return path.contains("/public/")||path.contains("/swagger-ui/");
    }

}
