package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;

@Getter
public class Competencia {
	@NotEmpty @Length(min = 3, max = 255)
	private String nome;
	@NotNull @Min(0) @Max(10) 
	private Integer nota;
	@NotNull
	private TipoCompetencia tipoCompetencia;
}
