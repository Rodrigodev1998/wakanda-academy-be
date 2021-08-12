package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;

@Getter
public class Competencia {
	@NotEmpty
	private String nome;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer nota;
	@NotEmpty
	private TipoCompetencia tipoCompetencia;
}
