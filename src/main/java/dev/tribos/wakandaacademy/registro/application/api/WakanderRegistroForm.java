package dev.tribos.wakandaacademy.registro.application.api;

import java.util.UUID;

import dev.tribos.wakandaacademy.registro.domain.PreCadastroWakander;
import dev.tribos.wakandaacademy.registro.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class WakanderRegistroForm {

	private UUID id;

	private String nome;
	private String email;
	private Integer idade;
	private String relacionamento;
	private Boolean filhos;
	private PreCadastroWakander preCadastro;

	public Wakander toRegistro() {
		return Wakander.builder().nome(nome).email(email).idade(idade).filhos(filhos).relacionamento(relacionamento)
				.preCadastro(preCadastro).build();

	}
}
