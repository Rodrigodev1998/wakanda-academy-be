package dev.tribos.wakandaacademy.credencial.domain;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.core.GrantedAuthority;


import lombok.Data;


@Data
public class Perfil implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;
	
	@MongoId()

	private UUID id;
	private String nome;
	
	@Override
	public String getAuthority() {
		return this.nome;
	}
	

}
