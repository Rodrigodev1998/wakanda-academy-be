package dev.tribos.wakandaacademy.wakander.application.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.wakander.domain.PreCadastroWakander;
import dev.tribos.wakandaacademy.wakander.domain.TipoRelacionamento;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;

@Getter
public class WakanderRegistroForm {

	@NotEmpty(message = "o nome não pode estar vazio")
	private String nome;

	@Email(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail")
	@NotEmpty(message = "o email não pode estar vazio")
	private String email;

	@NotEmpty
	@Pattern(regexp = "^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$", message = "o numero de celular  deve ser valido")
	private String whatsapp;

	@Positive
	@Max(value = 100, message = "idade não pode ser maior que 100")
	private Integer idade;

	@NotNull
	private TipoRelacionamento relacionamento;

	@NotNull
	private Boolean filhos;

	@NotEmpty
	@Length(min = 5)
	private String vidaAcademica;

	@NotEmpty
	@Length(min = 5)
	private String experienciaEmprego;

	@NotNull
	private Boolean trabalhoProgramacao;

	@NotEmpty
	@Length(min = 5)
	private String sobreWakanda;

	@NotEmpty
	@Length(min = 5)
	private String participar;

	public Wakander toRegistro() {
		return Wakander.builder().nome(nome).email(email).idade(idade).filhos(filhos).relacionamento(relacionamento)
				.preCadastro(PreCadastroWakander.builder()
						.vidaAcademica(vidaAcademica)
						.experienciaEmprego(experienciaEmprego)
						.participar(participar)
						.trabalhoProgramacao(trabalhoProgramacao)
						.sobreWakanda(sobreWakanda)
						.build())
				.whatsapp(whatsapp).build();

	}
}
