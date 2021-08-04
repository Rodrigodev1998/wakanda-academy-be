package dev.tribos.wakandaacademy.autenticacao.application.api;

import dev.tribos.wakandaacademy.autenticacao.application.AutenticacaoForm;
import dev.tribos.wakandaacademy.autenticacao.application.TokenDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/public/v1/autenticacao")
public interface AutenticacaoAPI {
	@PostMapping
	ResponseEntity<TokenDTO> autenticacao(@RequestBody @Valid AutenticacaoForm autenticacaoForm)
			throws AuthenticationException;

	@PostMapping("/reativacao")
	ResponseEntity<TokenDTO> reativaAutenticacao(@RequestHeader("Authorization") String tokenExpirado)
			throws AuthenticationException;
}
