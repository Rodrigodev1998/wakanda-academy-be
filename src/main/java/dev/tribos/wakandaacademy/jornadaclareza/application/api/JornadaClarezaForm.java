package dev.tribos.wakandaacademy.jornadaclareza.application.api;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.jornadaclareza.domain.Area;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;

public class JornadaClarezaForm {
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String oQueVoceFariaSeOMundoAcabasse;
	 
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String facaUmaListaDeTudo;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String ondeVoceQuerChegar;
	
	@NotNull
	private Area comoVocePrefereAtuar;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String quantoVoceQuerGanharAte2022;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String quantoVoceQuerGanharAte2025;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String porqueInvestirEmVoce;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String descrevaAFotografia;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String oQueVaiTeFazerContinuar;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String nivelDaSuaResponsabilidade;
	
	@NotNull
	private Integer nivelComprometimento;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String ondeIraEstudar;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String qualTEmpoDeEstudo;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String feedback;
	
	public JornadaClareza paraEntidade() {
		return JornadaClareza.builder()
				.OqueVoceFariaSeOMundoAcabasse(oQueVoceFariaSeOMundoAcabasse)
				.FacaUmaListaDeTudo(facaUmaListaDeTudo)
				.OndeVoceQuerChegar(ondeVoceQuerChegar)
				.ComoVocePrefereAtuar(comoVocePrefereAtuar)
				.QuantoVoceQuerGanharAte2022(quantoVoceQuerGanharAte2022)
				.QuantoVoceQuerGanharAte2025(quantoVoceQuerGanharAte2025)
				.PorqueInvestirEmVoce(porqueInvestirEmVoce)
				.DescrevaAFotografia(descrevaAFotografia)
				.OQueVaiTeFazerContinuar(oQueVaiTeFazerContinuar)
				.NivelDaSuaResponsabilidade(nivelDaSuaResponsabilidade)
				.NivelComprometimento(nivelComprometimento).OndeIraEstudar(ondeIraEstudar)
				.QualTEmpoDeEstudo(qualTEmpoDeEstudo)
				.Feedback(feedback)
				.build();
	}

}
