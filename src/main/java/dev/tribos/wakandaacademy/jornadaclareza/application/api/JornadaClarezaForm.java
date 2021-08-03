package dev.tribos.wakandaacademy.jornadaclareza.application.api;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.jornadaclareza.domain.Area;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;
import lombok.Getter;

@Getter
public class JornadaClarezaForm {
	
	@NotEmpty
	@Length(min = 5)
	private String seOMundoAcabasse;
	 
	@NotEmpty
	@Length(min = 5)
	private String umaLista;
	
	@NotEmpty
	@Length(min = 5)
	private String seusSonhos;
	
	@NotNull
	private Area areaAtuacao;
	
	@NotEmpty
	@Length(min = 5)
	private String ganharAte2022;
	
	@NotEmpty
	@Length(min = 5)
	private String ganharAte2025;
	
	@NotEmpty
	@Length(min = 5)
	private String investirEmVoce;
	
	@NotEmpty
	@Length(min = 5)
	private String fotografia;
	
	@NotEmpty
	@Length(min = 5)
	private String propositoInabalavel;
	
	@NotEmpty
	@Length(min = 5)
	private String nivelResponsabilidade;
	
	@Positive
	@Max(value = 100, message = "nível não pode ser maior que 100")
	@NotNull
	private Integer nivelComprometimento;
	
	@NotEmpty
	@Length(min = 5)
	private String ondeEstudar;
	
	@NotEmpty
	@Length(min = 5)
	private String tempoEstudo;
	
	@NotEmpty
	@Length(min = 5)
	private String feedback;
	
	public JornadaClareza paraEntidade() {
		return JornadaClareza.builder()
				.seOMundoAcabasse(seOMundoAcabasse)
				.umaLista(umaLista)
				.seusSonhos(seusSonhos)
				.areaAtuacao(areaAtuacao)
				.ganharAte2022(ganharAte2022)
				.ganharAte2025(ganharAte2025)
				.investirEmVoce(investirEmVoce)
				.fotografia(fotografia)
				.propositoInabalavel(propositoInabalavel)
				.nivelResponsabilidade(nivelResponsabilidade)
				.nivelComprometimento(nivelComprometimento)
				.ondeEstudar(ondeEstudar)
				.tempoEstudo(tempoEstudo)
				.feedback(feedback)
				.build();
	}

}
