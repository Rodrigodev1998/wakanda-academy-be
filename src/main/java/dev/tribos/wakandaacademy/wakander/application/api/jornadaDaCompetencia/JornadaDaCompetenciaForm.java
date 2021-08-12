package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

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
	private LocalDateTime inicio;
	@NotNull
	private LocalDateTime conclusao;
	@NotNull
	private Competencia primeiraCompetenciaSelecionada;
	@NotNull
	private Competencia segundaCompetenciaSelecionada;
	@NotEmpty
	private List<Competencia> listaCompetencias;
	@NotEmpty
	private String acoesDesenvolverCompetencias; 
	@NotEmpty
	private String importanciaEmParticipar;

	public JornadaDaCompetencia paraEntidade() {
		return JornadaDaCompetencia.builder()
				.codigo(CodigoEtapaJornadaAtitude.JORNADA_COMPETENCIA.name())
				.nome(nome)
				.primeiraCompetenciaSelecionada(primeiraCompetenciaSelecionada)
				.segundaCompetenciaSelecionada(segundaCompetenciaSelecionada).listaCompetencias(listaCompetencias)
				.definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas(acoesDesenvolverCompetencias)
				.porqueFoImportanteParticiparHj(importanciaEmParticipar)
				.build();
	}

}
