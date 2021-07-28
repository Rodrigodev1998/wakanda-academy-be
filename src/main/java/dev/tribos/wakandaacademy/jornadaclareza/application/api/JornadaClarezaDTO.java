package dev.tribos.wakandaacademy.jornadaclareza.application.api;

import dev.tribos.wakandaacademy.jornadaclareza.domain.Area;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;
import lombok.Getter;

@Getter
public class JornadaClarezaDTO {
	
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
	
	public JornadaClarezaDTO(JornadaClareza jornadaClareza) {
		this.OqueVoceFariaSeOMundoAcabasse = jornadaClareza.getOqueVoceFariaSeOMundoAcabasse();
		this.FacaUmaListaDeTudo = jornadaClareza.getFacaUmaListaDeTudo();
		this.OndeVoceQuerChegar = jornadaClareza.getOndeVoceQuerChegar();
		this.ComoVocePrefereAtuar = jornadaClareza.getComoVocePrefereAtuar();
		this.QuantoVoceQuerGanharAte2022 = jornadaClareza.getQuantoVoceQuerGanharAte2022();
		this.QuantoVoceQuerGanharAte2025 = jornadaClareza.getQuantoVoceQuerGanharAte2025();
		this.PorqueInvestirEmVoce = jornadaClareza.getPorqueInvestirEmVoce();
		this.DescrevaAFotografia = jornadaClareza.getDescrevaAFotografia();
		this.OQueVaiTeFazerContinuar = jornadaClareza.getOQueVaiTeFazerContinuar();
		this.NivelDaSuaResponsabilidade = jornadaClareza.getNivelDaSuaResponsabilidade();
		this.NivelComprometimento = jornadaClareza.getNivelComprometimento();
		this.OndeIraEstudar = jornadaClareza.getOndeIraEstudar();
		this.QualTEmpoDeEstudo = jornadaClareza.getQualTEmpoDeEstudo();
		this.Feedback = jornadaClareza.getFeedback();
		
	}
}
