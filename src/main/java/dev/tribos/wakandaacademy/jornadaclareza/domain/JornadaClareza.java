package dev.tribos.wakandaacademy.jornadaclareza.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
@Document(collection = "Jornada_Clareza")
public class JornadaClareza {
	
	@MongoId(targetType = FieldType.OBJECT_ID)
	private String codigo;
	private String seOMundoAcabasse;
	private String umaLista;
	private String seusSonhos;
	private Area areaAtuacao;
	private String ganharAte2022;
	private String ganharAte2025;
	private String investirEmVoce;
	private String fotografia;
	private String propositoInabalavel;
	private String nivelResponsabilidade;
	private Integer nivelComprometimento;
	private String ondeEstudar;
	private String tempoEstudo;
	private String feedback;

}
