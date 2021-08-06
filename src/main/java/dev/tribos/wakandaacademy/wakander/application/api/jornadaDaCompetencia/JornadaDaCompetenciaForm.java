package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.time.LocalDateTime;
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
	private LocalDateTime inicio;

	@NotEmpty
	private LocalDateTime conclusao;

	@NotEmpty
	private Competencia primeiraCompetenciaSelecionada;

	@NotEmpty
	private Competencia segundaCompetenciaSelecionada;

	@NotEmpty
	private List<Competencia> listaCompetencias;

	public JornadaDaCompetencia paraEntidade() {

		return JornadaDaCompetencia.builder()
				.nome(nome)
				.inicio(inicio)
				.conclusao(conclusao)
				.primeiraCompetenciaSelecionada(primeiraCompetenciaSelecionada)
				.segundaCompetenciaSelecionada(segundaCompetenciaSelecionada)
				.listaCompetencias(listaCompetencias)
				.build();
	}

}
