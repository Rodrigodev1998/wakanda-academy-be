package dev.tribos.wakandaacademy.registro.domain;

import java.util.UUID;



import lombok.Builder;
import lombok.Getter;


import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.mongodb.core.mapping.Document;


@Getter

@Builder
@Document(collection = "registro")
public class Registro {
	
	@Id

	private UUID id;
	
	private String nome;
	
	private String email;
	
	private Integer idade;
	
	private String relacionamento;
	
	private Boolean filhos; // Filhos Boolean? 
	
	
	private String vidaAcademica;
	
	private String experienciaDeEmprego;
	
	private Boolean trabalhoComProgramacao; // Boolean
	
	private String oqueEntendeuSobreWakanda;
	
	private String porqueParticiparDoWakanda;

}
