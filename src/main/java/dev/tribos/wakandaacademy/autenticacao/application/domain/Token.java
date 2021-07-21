package dev.tribos.wakandaacademy.autenticacao.application.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Token {
    private String token;
    private String tipo;
}
