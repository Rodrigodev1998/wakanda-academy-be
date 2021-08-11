package dev.tribos.wakandaacademy.wakander.application.api.jornadaclareza;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.CodigoEtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.Area;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaClareza;
import lombok.Getter;

@Getter
public class JornadaClarezaForm {
	@NotEmpty
	@Length(min = 5)
	private String nome;

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
	
	@Min(0)
	@Max(value = 10, message = "nível não pode ser maior que 10")
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
				.codigo(CodigoEtapaJornadaAtitude.JORNADA_CLAREZA.name())
				.nome(nome)
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