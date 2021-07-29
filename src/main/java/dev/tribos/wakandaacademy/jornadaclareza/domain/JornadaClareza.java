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
	private String oQueVoceFariaSeOMundoAcabasse;
	private String facaUmaListaDeTudo;
	private String ondeVoceQuerChegar;
	private Area comoVocePrefereAtuar;
	private String quantoVoceQuerGanharAte2022;
	private String quantoVoceQuerGanharAte2025;
	private String porqueInvestirEmVoce;
	private String descrevaAFotografia;
	private String oQueVaiTeFazerContinuar;
	private String nivelDaSuaResponsabilidade;
	private Integer nivelComprometimento;
	private String ondeIraEstudar;
	private String qualTEmpoDeEstudo;
	private String feedback;

}
