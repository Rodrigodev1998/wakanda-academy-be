package dev.tribos.wakandaacademy.wakanda.domain;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Getter
@Builder
public class EtapaJornadaAtitudeWakanda {

    @NotEmpty(message = "o nome não pode estar vazio")
    @Max(value = 100)
    private String nome;

    private String descricao;

    private String logo = null;

    private Boolean padrao;
}
