package dev.tribos.wakandaacademy.autenticacao.application;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@Data
@Builder
public class AutenticacaoForm {
	@NotNull
	@NotBlank(message = "O usuário não pode estar em branco!")
	@Pattern(regexp = "^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$", message = "Whatsapp inválido!")
	private String usuario;
	@Size(min = 4, message = "A senha deve ter no mínimo 4 caracteres")
	@NotNull
	private String senha;

	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(usuario, senha);
	}
}
