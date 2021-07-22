package dev.tribos.wakandaacademy.autenticacao.application.service;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import dev.tribos.wakandaacademy.handler.ApiException;
import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.autenticacao.application.domain.Token;
import dev.tribos.wakandaacademy.config.security.service.TokenService;
import dev.tribos.wakandaacademy.credencial.application.service.CredencialService;
import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class AutenticacaoSpringDataMongoDBService implements AutenticacaoService {
	private AuthenticationManager authenticationManager;
	private TokenService tokenService;
	private CredencialService credencialService;

	@Override
	public Token autenticacao(UsernamePasswordAuthenticationToken userCredentials) {
		log.info("[inicio] AutenticacaoSpringDataMongoDBService - autenticacao");
		var authentication = authenticationManager.authenticate(userCredentials);
		log.info("[finaliza] AutenticacaoSpringDataMongoDBService - autenticacao");
		return Token.builder().tipo("Bearer").token(tokenService.gerarToken(authentication)).build();
	}

	@Override
	public Token reativaAutenticacao(String tokenExpirado) {
		log.info("[inicio] AutenticacaoSpringDataMongoDBService - reativaAutenticacao");
		var id = extraiId(tokenExpirado);
		Credencial credencial = credencialService.buscaCredencialPorId(id);
		log.info("[finaliza] AutenticacaoSpringDataMongoDBService - reativaAutenticacao");
		return Token.builder().tipo("Bearer").token(tokenService.gerarToken(credencial)).build();
	}

	private String extraiId(String tokenExpirado) {
		return tokenService.getId(tokenExpirado).orElseThrow(() -> ApiException.throwApiException(HttpStatus.FORBIDDEN,
				"O Token enviado está inválido. Tente novamente."));
	}

}
