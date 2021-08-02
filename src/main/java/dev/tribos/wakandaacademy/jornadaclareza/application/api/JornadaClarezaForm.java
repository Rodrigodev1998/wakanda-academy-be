package dev.tribos.wakandaacademy.jornadaclareza.application.api;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.jornadaclareza.domain.Area;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;
import lombok.Getter;

@Getter
public class JornadaClarezaForm {
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String seOMundoAcabasse;
	 
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String umaLista;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String seusSonhos;
	
	@NotNull
	private Area areaAtuacao;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String ganharAte2022;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String ganharAte2025;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String investirEmVoce;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 1000, message = "Quantidade de caracteres excede o limite de 1000 caracteres")
	private String fotografia;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String propositoInabalavel;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 0, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 100, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String nivelResponsabilidade;
	
	@NotNull
	private Integer nivelComprometimento;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String ondeEstudar;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String tempoEstudo;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
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
