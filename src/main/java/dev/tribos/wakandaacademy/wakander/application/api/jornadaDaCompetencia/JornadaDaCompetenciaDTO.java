package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.Competencia;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaDTO {
	private String nome;
	private LocalDateTime conclusao;
	private List<Competencia> listaCompetencias;
	private Competencia primeiraCompetenciaSelecionada;
	private Competencia segundaCompetenciaSelecionada;
	private String acoesDesenvolverCompetencias;
	private String importanciaEmParticipar;

	public JornadaDaCompetenciaDTO(Wakander wakander) {
		JornadaDaCompetencia jornadaCompetencia = wakander.getJornadaCompetencia();
		this.nome = jornadaCompetencia.getNome();
		this.conclusao = jornadaCompetencia.getDataConclusao();
		this.listaCompetencias = jornadaCompetencia.getListaCompetencias();
		this.primeiraCompetenciaSelecionada = jornadaCompetencia.getPrimeiraCompetenciaSelecionada();
		this.segundaCompetenciaSelecionada = jornadaCompetencia.getSegundaCompetenciaSelecionada();
		this.acoesDesenvolverCompetencias = jornadaCompetencia
				.getAcoesDesenvolverCompetencias();
		this.importanciaEmParticipar = jornadaCompetencia.getImportanciaEmParticipar();

	}
}
