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
	
	@NotEmpty
	private String nome;
	
	
	private StatusJornadaDaCompetencia statusJornadaDaCompetencia;
	
	
	public void mudaStatusParaIniciado() {
		this.statusJornadaDaCompetencia = StatusJornadaDaCompetencia.INICIADO;
	} 
	

}
