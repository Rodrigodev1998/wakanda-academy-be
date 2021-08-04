package dev.tribos.wakandaacademy.credencial.application.api;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
public class CredencialForm {

	@NotNull
	@NotBlank(message = "O usuário não pode estar em branco!")
	@Email(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail")
	private String usuario;

	@Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
	@NotNull
	private String senha;

	public Credencial toEntityCredencial() {
		return Credencial.builder().usuario(this.usuario).senha(this.senha).build();
	}

}
