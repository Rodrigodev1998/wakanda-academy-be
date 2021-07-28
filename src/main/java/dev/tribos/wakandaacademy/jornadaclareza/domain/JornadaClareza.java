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
	private String OqueVoceFariaSeOMundoAcabasse;
	private String FacaUmaListaDeTudo;
	private String OndeVoceQuerChegar;
	private Area ComoVocePrefereAtuar;
	private String QuantoVoceQuerGanharAte2022;
	private String QuantoVoceQuerGanharAte2025;
	private String PorqueInvestirEmVoce;
	private String DescrevaAFotografia;
	private String OQueVaiTeFazerContinuar;
	private String NivelDaSuaResponsabilidade;
	private Integer NivelComprometimento;
	private String OndeIraEstudar;
	private String QualTEmpoDeEstudo;
	private String Feedback;

}
