package dev.tribos.wakandaacademy.autenticacao.application;


import dev.tribos.wakandaacademy.autenticacao.application.domain.Token;
import lombok.Value;

@Value
public class TokenDTO {
    private String token;
    private String tipo;

    public TokenDTO(Token token){
        this.token=token.getToken();
        this.tipo=token.getTipo();
    }
}
