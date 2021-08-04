package dev.tribos.wakandaacademy.credencial.application.api;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

import javax.validation.Valid;

@Value
@Valid
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class CredencialDTO {

	public CredencialDTO(Credencial credencialCriada) {
		this.usuario = credencialCriada.getUsuario();
	}

	private String usuario;

}
