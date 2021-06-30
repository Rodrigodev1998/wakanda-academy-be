package dev.tribos.wakandaacademy.registro.domain;

import lombok.Builder;
import lombok.Getter;

import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@Document(collection = "Wakander")
public class Wakander {

	private String nome;
	private String email;
	private Integer idade;
	private String relacionamento;
	private Boolean filhos;

	private PreCadastroWakander preCadastro;

}

;
