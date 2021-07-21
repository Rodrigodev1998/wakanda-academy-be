package dev.tribos.wakandaacademy.autenticacao.application.service;


import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import dev.tribos.wakandaacademy.autenticacao.application.domain.Token;

public interface AutenticacaoService {
    Token autenticacao(UsernamePasswordAuthenticationToken userCredentials);
    Token reativaAutenticacao(String tokenExpirado);
}
