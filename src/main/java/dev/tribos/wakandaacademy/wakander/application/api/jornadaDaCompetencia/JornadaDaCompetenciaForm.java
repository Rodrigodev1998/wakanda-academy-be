package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.CodigoEtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.Competencia;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaForm {
	@NotEmpty @Length(min = 5)
	private String nome;
	@NotNull
	private LocalDateTime conclusao;
	@NotNull @Valid
	private List<Competencia> listaCompetencias;
	@NotNull @Valid
	private Competencia primeiraCompetenciaSelecionada;
	@NotNull @Valid
	private Competencia segundaCompetenciaSelecionada;
	@NotEmpty @Length(min = 5)
	private String acoesDesenvolverCompetencias; 
	@NotEmpty @Length(min = 5)
	private String importanciaEmParticipar;

	public JornadaDaCompetencia paraEntidade() {
		return JornadaDaCompetencia.builder()
				.codigo(CodigoEtapaJornadaAtitude.JORNADA_COMPETENCIA.name())
				.nome(nome)
				.dataConclusao(conclusao)
				.primeiraCompetenciaSelecionada(primeiraCompetenciaSelecionada)
				.segundaCompetenciaSelecionada(segundaCompetenciaSelecionada).listaCompetencias(listaCompetencias)
				.acoesDesenvolverCompetencias(acoesDesenvolverCompetencias)
				.importanciaEmParticipar(importanciaEmParticipar)
				.build();
	}

}
