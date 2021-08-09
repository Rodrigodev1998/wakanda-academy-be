package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.Competencia;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaForm {

	@NotEmpty
	@Length(min = 5)
	private String nome;

	@NotEmpty
	private String inicio;

	@NotEmpty
	private String conclusao;

	private Competencia primeiraCompetenciaSelecionada;

	private Competencia segundaCompetenciaSelecionada;

	@NotEmpty
	private List<Competencia> listaCompetencias;

	public JornadaDaCompetencia paraEntidade() {

		return JornadaDaCompetencia.builder().nome(nome).inicio(inicio).conclusao(conclusao)
				.primeiraCompetenciaSelecionada(primeiraCompetenciaSelecionada)
				.segundaCompetenciaSelecionada(segundaCompetenciaSelecionada).listaCompetencias(listaCompetencias)
				.build();
	}

}
