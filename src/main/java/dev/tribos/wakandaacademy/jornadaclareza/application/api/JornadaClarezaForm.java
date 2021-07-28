package dev.tribos.wakandaacademy.jornadaclareza.application.api;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;

public class JornadaClarezaForm {
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String OqueVoceFariaSeOMundoAcabasse;
	 
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String FacaUmaListaDeTudo;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String OndeVoceQuerChegar;
	
	@NotNull
	private Integer ComoVocePrefereAtuar;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String QuantoVoceQuerGanharAte2022;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String QuantoVoceQuerGanharAte2025;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String PorqueInvestirEmVoce;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String DescrevaAFotografia;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String OQueVaiTeFazerContinuar;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String NivelDaSuaResponsabilidade;
	
	@NotNull
	private Integer NivelComprometimento;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String OndeIraEstudar;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String QualTEmpoDeEstudo;
	
	@NotEmpty(message = "Campo obrigatório!")
	@Length(min = 5, message = "Quantidade de caracteres não bate com o limite mínimo de 5 caracteres! ")
	@Length(max = 550, message = "Quantidade de caracteres excede o limite de 550 caracteres")
	private String Feedback;
	
	public JornadaClareza paraEntidade() {
		return JornadaClareza.builder()
				.OqueVoceFariaSeOMundoAcabasse(OqueVoceFariaSeOMundoAcabasse)
				.FacaUmaListaDeTudo(FacaUmaListaDeTudo)
				.OndeVoceQuerChegar(OndeVoceQuerChegar)
				.ComoVocePrefereAtuar(ComoVocePrefereAtuar)
				.QuantoVoceQuerGanharAte2022(QuantoVoceQuerGanharAte2022)
				.QuantoVoceQuerGanharAte2025(QuantoVoceQuerGanharAte2025)
				.PorqueInvestirEmVoce(PorqueInvestirEmVoce)
				.DescrevaAFotografia(DescrevaAFotografia)
				.OQueVaiTeFazerContinuar(OQueVaiTeFazerContinuar)
				.NivelDaSuaResponsabilidade(NivelDaSuaResponsabilidade)
				.NivelComprometimento(NivelComprometimento).OndeIraEstudar(OndeIraEstudar)
				.QualTEmpoDeEstudo(QualTEmpoDeEstudo)
				.Feedback(Feedback)
				.build();
	}

}
