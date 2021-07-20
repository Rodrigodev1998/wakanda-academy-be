package dev.tribos.wakandaacademy.autenticacao.application.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import dev.tribos.wakandaacademy.handler.ApiException;
import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.autenticacao.application.domain.Token;
import dev.tribos.wakandaacademy.config.security.service.TokenService;
import dev.tribos.wakandaacademy.credencial.application.service.CredencialService;
import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AutenticacaoJpaService implements AutenticacaoService {

	private AuthenticationManager authenticationManager;
	private TokenService tokenService;
	private CredencialService credencialService;

	public AutenticacaoJpaService(AuthenticationManager authenticationManager, TokenService tokenService,
			CredencialService credencialService) {
		this.authenticationManager = authenticationManager;
		this.tokenService = tokenService;
		this.credencialService = credencialService;
	}

	@Override
	public Token autenticacao(UsernamePasswordAuthenticationToken userCredentials) {
		log.info("[inicio] service - autenticacao");
		var authentication = authenticationManager.authenticate(userCredentials);
		log.info("[finaliza] service - autenticacao");
		return Token.builder().tipo("Bearer").token(tokenService.gerarToken(authentication)).build();
	}

	@Override
	public Token reativaAutenticacao(String tokenExpirado) {
		log.info("[inicio] service - reativaAutenticacao");
		var id = extraiId(tokenExpirado);
		Credencial credencial = credencialService.buscaCredencialPorId(id);
		log.info("[finaliza] service - reativaAutenticacao");
		return Token.builder().tipo("Bearer").token(tokenService.gerarToken(credencial)).build();
	}

	private UUID extraiId(String tokenExpirado) {
		return tokenService.getId(tokenExpirado).orElseThrow(() -> ApiException.throwApiException(HttpStatus.FORBIDDEN,
				"O Token enviado está inválido. Tente novamente."));
	}

}
