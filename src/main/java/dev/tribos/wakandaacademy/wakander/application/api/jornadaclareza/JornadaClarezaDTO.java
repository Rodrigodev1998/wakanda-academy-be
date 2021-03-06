package dev.tribos.wakandaacademy.wakander.application.api.jornadaclareza;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaclareza.Area;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaclareza.JornadaClareza;
import lombok.Getter;

@Getter
public class JornadaClarezaDTO {
	private String nome;
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
	
	
	JornadaClarezaDTO(Wakander wakander) {
		JornadaClareza jornadaClareza = wakander.getJornadaClareza();
		this.nome = jornadaClareza.getNome();
		this.seOMundoAcabasse = jornadaClareza.getSeOMundoAcabasse();
		this.umaLista = jornadaClareza.getUmaLista();
		this.seusSonhos = jornadaClareza.getSeusSonhos();
		this.areaAtuacao = jornadaClareza.getAreaAtuacao();
		this.ganharAte2022 = jornadaClareza.getGanharAte2022();
		this.ganharAte2025 = jornadaClareza.getGanharAte2025();
		this.investirEmVoce = jornadaClareza.getInvestirEmVoce();
		this.fotografia = jornadaClareza.getFotografia();
		this.propositoInabalavel = jornadaClareza.getPropositoInabalavel();
		this.nivelResponsabilidade = jornadaClareza.getNivelResponsabilidade();
		this.nivelComprometimento = jornadaClareza.getNivelComprometimento();
		this.ondeEstudar = jornadaClareza.getOndeEstudar();
		this.tempoEstudo = jornadaClareza.getTempoEstudo();
		this.feedback = jornadaClareza.getFeedback();
	}
}
