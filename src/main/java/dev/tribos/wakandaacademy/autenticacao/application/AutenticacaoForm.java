package dev.tribos.wakandaacademy.autenticacao.application;

import lombok.Builder;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@Data
@Builder
public class AutenticacaoForm {
	
	@NotNull
	@NotBlank(message = "O usuário não pode estar em branco!")
	@Email(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail")
	
	private String usuario;
	@Size(min = 4, message = "A senha deve ter no mínimo 4 caracteres")
	@NotNull
	private String senha;

	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(usuario, senha);
	}
}
