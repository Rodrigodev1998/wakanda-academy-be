package dev.tribos.wakandaacademy.wakanda.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EtapaJornadaAtitudeWakanda {
	@NotEmpty(message = "o codigo não pode estar vazio")
	@Max(value = 100)
	private String codigo;
	
    @NotEmpty(message = "o nome não pode estar vazio")
    @Max(value = 100)
    private String nome;

    private String descricao;

    private String logo;

    private Boolean padrao;
}
