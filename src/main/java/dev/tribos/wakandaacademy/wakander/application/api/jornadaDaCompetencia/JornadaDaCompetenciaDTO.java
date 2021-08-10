package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.util.List;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
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

	public JornadaDaCompetenciaDTO(Wakander wakander) {
		JornadaDaCompetencia jornadaCompetencia = wakander.getJornadaCompetencia();
		this.primeiraCompetenciaSelecionada = jornadaCompetencia.getPrimeiraCompetenciaSelecionada();
		this.segundaCompetenciaSelecionada = jornadaCompetencia.getSegundaCompetenciaSelecionada();
		this.definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas = jornadaCompetencia.getDefinaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas();
		this.porqueFoImportanteParticiparHj = jornadaCompetencia.getPorqueFoImportanteParticiparHj();

	}

//	public static List<JornadaDaCompetenciaDTO> converte(List<JornadaDaCompetencia> jornadaCompetencia) {
//		List< JornadaDaCompetenciaDTO> jornadaDTO = jornadaCompetencia
//				.stream().map(JornadaDaCompetenciaDTO::new)
//				.collect(Collectors.toList());
//		 return jornadaDTO;
//		
//		
//	}
}
