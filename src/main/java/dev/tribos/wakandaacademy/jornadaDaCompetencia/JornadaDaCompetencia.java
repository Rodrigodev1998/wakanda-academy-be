package dev.tribos.wakandaacademy.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.StatusEtapaJornadaAtitude;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder 
public class JornadaDaCompetencia  implements EtapaJornadaAtitude {
	
	@NotEmpty 
	private LocalDateTime inicio;
	
	private LocalDateTime conclusao;
	
	@NotEmpty 
	private Competencia primeiraCompetenciaSelecionada;
	
	@NotEmpty 
	private Competencia segundaCompetenciaSelecionada;
	
	@NotEmpty 
	private List<Competencia> listaCompetencias;

	@Override
	public String getLogo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusEtapaJornadaAtitude getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
