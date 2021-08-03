package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder 
public class JornadaDaCompetencia {
	@NotEmpty @NotNull
	private LocalDateTime inicio;
	
	private LocalDateTime conclusao;
	
	@NotEmpty @NotNull
	private Competencia primeiraCompetenciaSelecionada;
	
	@NotEmpty @NotNull
	private Competencia segundaCompetenciaSelecionada;
	
	@NotEmpty @NotNull
	private List<Competencia> listaCompetencias;
	

}
