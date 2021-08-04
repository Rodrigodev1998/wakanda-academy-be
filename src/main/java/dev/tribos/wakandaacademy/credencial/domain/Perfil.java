package dev.tribos.wakandaacademy.credencial.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.core.GrantedAuthority;

import java.util.UUID;


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
