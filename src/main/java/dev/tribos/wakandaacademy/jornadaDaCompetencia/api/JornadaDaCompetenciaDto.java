package dev.tribos.wakandaacademy.jornadaDaCompetencia.api;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.StatusJornadaDaCompetencia;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaDto {
	private String nome;
	private StatusJornadaDaCompetencia statusJornadaDaCompetencia;
	
	public JornadaDaCompetenciaDto (JornadaDaCompetencia jornadaDaCompetencia) {
		this.nome = jornadaDaCompetencia.getNome();
		this.statusJornadaDaCompetencia= jornadaDaCompetencia.getStatusJornadaDaCompetencia();
	}
	

}
