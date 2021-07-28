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
	private Integer conhecimentoBackendJava;
	@NotEmpty
	private Integer conhecimentoBancodeDados;
	@NotEmpty
	private Integer conhecimentoGITHUB;
	@NotEmpty
	private Integer compreensãoDevops;
	@NotEmpty
	private Integer conhecimentoEmTestes;
	@NotEmpty
	private Integer conhecimentoEmAgile;
	@NotEmpty
	private Integer conhecimentoEmScrum;
	@NotEmpty
	private String definicaoDePrimeiraCompetência;
	@NotEmpty
	private Integer mediaPrimeiraCompetência;
	@NotEmpty
	private String definicaoDeSegundaCompetencia;
	@NotEmpty
	private Integer mediaSegundaCompetencia;
	@NotEmpty
	private String escolhaDeCompetencias;
	@NotEmpty
	private String acaoParaDesenvolvimentoDeCompetencia; 
	@NotEmpty
	private String porqueValeuAPena;
	@NotEmpty
	private StatusJornadaDaCompetencia statusJornadaDaCompetencia;
	

	
	
	
	public void mudaStatusParaIniciado() {
		this.statusJornadaDaCompetencia = StatusJornadaDaCompetencia.INICIADO;
	} 
	

}
