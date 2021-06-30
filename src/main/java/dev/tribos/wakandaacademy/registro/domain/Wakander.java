package dev.tribos.wakandaacademy.registro.domain;

import java.util.UUID;

import lombok.Builder;
import lombok.Getter;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@Document(collection = "Wakander") // Wakander - pre cadastro Ação.
public class Wakander {



	private String nome;
	private String email;
	private Integer idade;
	private TipoRelacionamento relacionamento;
	private Boolean filhos;
	
	private PreCadastroWakander preCadastro;

}


;

