package dev.tribos.wakandaacademy.jornadaDaCompetencia.api;

import java.util.List;
import java.util.stream.Collectors;

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

	
	public static List<JornadaDaCompetenciaDto> converter(List<JornadaDaCompetencia> jornadas) {
		
		return jornadas.stream().map(JornadaDaCompetenciaDto::new).collect(Collectors.toList());
	}

	
	

}
