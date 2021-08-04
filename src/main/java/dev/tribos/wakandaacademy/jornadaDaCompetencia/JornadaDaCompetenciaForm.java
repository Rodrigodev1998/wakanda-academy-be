package dev.tribos.wakandaacademy.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
@Getter
public class JornadaDaCompetenciaForm {
	@NotEmpty 
	private LocalDateTime inicio;
	
	@NotEmpty
	private LocalDateTime conclusao;
	
	@NotEmpty 
	private Competencia primeiraCompetenciaSelecionada;
	
	@NotEmpty 
	private Competencia segundaCompetenciaSelecionada;
	
	@NotEmpty 
	private List<Competencia> listaCompetencias;

    public JornadaDaCompetencia paraEntidade() {
    	
    	return JornadaDaCompetencia.builder()
    			.inicio(inicio)
    			.conclusao(conclusao)
    			.primeiraCompetenciaSelecionada(primeiraCompetenciaSelecionada)
    			.segundaCompetenciaSelecionada(segundaCompetenciaSelecionada)
    			.listaCompetencias(listaCompetencias).build();
    }
    
}
