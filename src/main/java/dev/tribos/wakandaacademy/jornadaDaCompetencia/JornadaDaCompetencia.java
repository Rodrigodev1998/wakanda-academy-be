package dev.tribos.wakandaacademy.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.StatusEtapaJornadaAtitude;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class JornadaDaCompetencia implements EtapaJornadaAtitude {

	private String logo;
	private String nome;
	private StatusEtapaJornadaAtitude status;
	private String descricao;

	private LocalDateTime inicio;
	private LocalDateTime conclusao;
	private Competencia primeiraCompetenciaSelecionada;
	private Competencia segundaCompetenciaSelecionada;
	private List<Competencia> listaCompetencias;
	
	@Override
	public void preenche(EtapaJornadaAtitude etapaJornadaAtitude) {
		// TODO Auto-generated method stub
		
	}

}
