package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.Competencia;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaDTO {
    private String nome;
    private Competencia primeiraCompetenciaSelecionada;
	private Competencia segundaCompetenciaSelecionada;
	private List<Competencia> listaCompetencias;
	private String definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas; 
	private String porqueFoImportanteParticiparHj;

	public JornadaDaCompetenciaDTO(JornadaDaCompetencia jornada) {
		this.primeiraCompetenciaSelecionada = jornada.getPrimeiraCompetenciaSelecionada();
		this.segundaCompetenciaSelecionada = jornada.getSegundaCompetenciaSelecionada();
		this.definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas = jornada.getDefinaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas();
		this.porqueFoImportanteParticiparHj = jornada.getPorqueFoImportanteParticiparHj();

	}

	public static List<JornadaDaCompetenciaDTO> converte(List<JornadaDaCompetencia> jornadaCompetencia) {
		List< JornadaDaCompetenciaDTO> jornadaDTO = jornadaCompetencia
				.stream().map(JornadaDaCompetenciaDTO::new)
				.collect(Collectors.toList());
		 return jornadaDTO;
		
		
	}

	
}
