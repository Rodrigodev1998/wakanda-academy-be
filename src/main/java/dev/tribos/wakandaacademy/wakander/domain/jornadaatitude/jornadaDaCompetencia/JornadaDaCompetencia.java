package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.StatusEtapaJornadaAtitude;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class JornadaDaCompetencia implements EtapaJornadaAtitudeWakander {

	private String logo;
	private String nome;
	private StatusEtapaJornadaAtitude status;
	private String descricao;

	private String inicio;
	private String conclusao;
	private Competencia primeiraCompetenciaSelecionada;
	private Competencia segundaCompetenciaSelecionada;
	private List<Competencia> listaCompetencias;
	
	@Override
	public void preenche(EtapaJornadaAtitudeWakander etapaJornadaAtitude) {
		JornadaDaCompetencia jornadaDaCompetencia = (JornadaDaCompetencia) etapaJornadaAtitude;
		this.inicio = jornadaDaCompetencia.getInicio();
		this.conclusao = jornadaDaCompetencia.getConclusao();
		this.primeiraCompetenciaSelecionada = jornadaDaCompetencia.getPrimeiraCompetenciaSelecionada();
		this.segundaCompetenciaSelecionada = jornadaDaCompetencia.getSegundaCompetenciaSelecionada();
		this.listaCompetencias = jornadaDaCompetencia.getListaCompetencias();
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

