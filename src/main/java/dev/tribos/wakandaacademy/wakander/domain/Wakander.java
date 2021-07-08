package dev.tribos.wakandaacademy.wakander.domain;

import lombok.Builder;
import lombok.Getter;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Builder
@Document(collection = "Wakander")
public class Wakander {

	@MongoId()
	private String Id;
	private String nome;
	private String email;
	private Integer idade;
	private String whatsapp;
	private TipoRelacionamento relacionamento;
	private Boolean possuiFilhos;

	private PreCadastroWakander preCadastro;

}
