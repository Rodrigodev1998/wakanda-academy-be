package dev.tribos.wakandaacademy.credencial.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import dev.tribos.wakandaacademy.credencial.domain.Credencial;

import lombok.Value;

@Value
public class CredencialForm {

	@NotNull
	@NotBlank(message = "O usuário não pode estar em branco!")
	private String usuario;

	@Size(min = 4, message = "A senha deve ter no mínimo 4 caracteres")
	@NotNull
	private String senha;

	public Credencial toEntityCredencial() {
		return Credencial.builder().usuario(this.usuario).senha(this.senha).build();
	}

}
