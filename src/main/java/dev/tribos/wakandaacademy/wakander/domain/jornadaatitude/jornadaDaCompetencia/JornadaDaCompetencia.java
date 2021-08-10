package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.StatusEtapaJornadaAtitude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaDaCompetencia implements EtapaJornadaAtitudeWakander {
	private String codigo;
	private String logo;
	private String nome;
	private StatusEtapaJornadaAtitude status;
	private String descricao;
	private LocalDateTime dataInicio;
	private LocalDateTime dataConclusao;

	private String inicio;
	private Competencia primeiraCompetenciaSelecionada;
	private Competencia segundaCompetenciaSelecionada;
	private List<Competencia> listaCompetencias;
	private String  definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas; 
	private String porqueFoImportanteParticiparHj;
	
	@Override
	public void preenche(EtapaJornadaAtitudeWakander etapaJornadaAtitude) {
		JornadaDaCompetencia jornadaDaCompetencia = (JornadaDaCompetencia) etapaJornadaAtitude;
		this.dataInicio = jornadaDaCompetencia.getDataInicio();
		this.dataConclusao = jornadaDaCompetencia.getDataConclusao();
		this.primeiraCompetenciaSelecionada = jornadaDaCompetencia.getPrimeiraCompetenciaSelecionada();
		this.segundaCompetenciaSelecionada = jornadaDaCompetencia.getSegundaCompetenciaSelecionada();
		this.listaCompetencias = jornadaDaCompetencia.getListaCompetencias();
		this.definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas = jornadaDaCompetencia.getDefinaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas();
		this.porqueFoImportanteParticiparHj = jornadaDaCompetencia.porqueFoImportanteParticiparHj;
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDateTime getDataConclusao() {
		// TODO Auto-generated method stub
		return null;
	}	
}

