package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.wakander.application.api.WakanderDTO;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaDTO {

	private LocalDateTime inicio;
	private LocalDateTime conclusao;
	private Competencia primeiraCompetenciaSelecionada;
	private Competencia segundaCompetenciaSelecionada;
	private List<Competencia> listaCompetencias;

	public JornadaDaCompetenciaDTO(LocalDateTime inicio, LocalDateTime conclusao,
			Competencia primeiraCompetenciaSelecionada, Competencia segundaCompetenciaSelecionada) {

		this.inicio = inicio;
		this.conclusao = conclusao;
		this.primeiraCompetenciaSelecionada = primeiraCompetenciaSelecionada;
		this.segundaCompetenciaSelecionada = segundaCompetenciaSelecionada;

	}

	public static List<JornadaDaCompetenciaDTO> converte(List<JornadaDaCompetencia> jornada) {
		 
			return null;
		
		
	}

	
}
