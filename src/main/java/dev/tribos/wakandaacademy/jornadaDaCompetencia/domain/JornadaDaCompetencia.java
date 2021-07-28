package dev.tribos.wakandaacademy.jornadaDaCompetencia.domain;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder 
@Document(collection = "JornadaDaCompetencia")
public class JornadaDaCompetencia {
	
	@MongoId(targetType = FieldType.OBJECT_ID)
	private String codigo;
	
	@NotEmpty(message = "o nome não pode estar vazio")
	private String nome;
	
	private StatusJornadaDaCompetencia statusJornadaDaCompetencia;
	
//	public JornadaDaCompetencia() {}
//	
	
//	// isto causou um erro na linha 13 @Builder
//	public JornadaDaCompetencia (String nome, StatusJornadaDaCompetencia status) {
//		this.nome = nome;
//		this.statusJornadaDaCompetencia = status;
//	}
	
	
	
	public void mudaStatusParaIniciado() {
		this.statusJornadaDaCompetencia = StatusJornadaDaCompetencia.INICIADO;
	} 
	

}
