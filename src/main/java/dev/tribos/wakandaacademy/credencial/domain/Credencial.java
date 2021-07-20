package dev.tribos.wakandaacademy.credencial.domain;

import java.util.Collection;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@ToString(exclude = "id")
@Document(collection = "Credencial")
public class Credencial implements UserDetails {
	
	private static final long serialVersionUID = 1L;

	@MongoId()
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@NotNull
	//@Column(unique = true)
	private String usuario;
	
	@NotNull
	//@Column(length = 60, nullable = false)
	private String senha;

	public Credencial(String usuario, @NotNull String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public void encriptaSenha() {
		var encriptador = new BCryptPasswordEncoder();
		this.senha = encriptador.encode(this.senha);
	}
    
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.usuario;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	} 

}
