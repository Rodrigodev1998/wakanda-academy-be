package dev.tribos.wakandaacademy.jornadaDaCompetencia;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;

@Getter
public class Competencia {
	
	@NotEmpty
    private String nome;
	
    @NotEmpty @Size(min=0, max=10)
    private Integer nota;
    
    private TipoCompetencia tipoCompetencia;
        
}
