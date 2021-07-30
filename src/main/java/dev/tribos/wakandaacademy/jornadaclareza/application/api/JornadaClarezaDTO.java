package dev.tribos.wakandaacademy.jornadaclareza.application.api;

import dev.tribos.wakandaacademy.jornadaclareza.domain.Area;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;
import lombok.Getter;

@Getter
public class JornadaClarezaDTO {
	
	private String oqueVoceFariaSeOMundoAcabasse;
	private String facaUmaListaDeTudo;
	private String ondeVoceQuerChegar;
	private Area comoVocePrefereAtuar;
	private String quantoVoceQuerGanharAte2022;
	private String quantoVoceQuerGanharAte2025;
	private String porqueInvestirEmVoce;
	private String descrevaAFotografia;
	private String oqueVaiTeFazerContinuar;
	private String nivelDaSuaResponsabilidade;
	private Integer nivelComprometimento;
	private String ondeIraEstudar;
	private String qualTEmpoDeEstudo;
	private String feedback;
	
	public JornadaClarezaDTO(JornadaClareza jornadaClareza) {
		this.oqueVoceFariaSeOMundoAcabasse = jornadaClareza.getOqueVoceFariaSeOMundoAcabasse();
		this.facaUmaListaDeTudo = jornadaClareza.getFacaUmaListaDeTudo();
		this.ondeVoceQuerChegar = jornadaClareza.getOndeVoceQuerChegar();
		this.comoVocePrefereAtuar = jornadaClareza.getComoVocePrefereAtuar();
		this.quantoVoceQuerGanharAte2022 = jornadaClareza.getQuantoVoceQuerGanharAte2022();
		this.quantoVoceQuerGanharAte2025 = jornadaClareza.getQuantoVoceQuerGanharAte2025();
		this.porqueInvestirEmVoce = jornadaClareza.getPorqueInvestirEmVoce();
		this.descrevaAFotografia = jornadaClareza.getDescrevaAFotografia();
		this.oqueVaiTeFazerContinuar = jornadaClareza.getOqueVaiTeFazerContinuar();
		this.nivelDaSuaResponsabilidade = jornadaClareza.getNivelDaSuaResponsabilidade();
		this.nivelComprometimento = jornadaClareza.getNivelComprometimento();
		this.ondeIraEstudar = jornadaClareza.getOndeIraEstudar();
		this.qualTEmpoDeEstudo = jornadaClareza.getQualTempoDeEstudo();
		this.feedback = jornadaClareza.getFeedback();
		
	}
}
