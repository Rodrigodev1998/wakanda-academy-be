package dev.tribos.wakandaacademy.credencial.domain;

import java.util.Collection;
import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
import lombok.Setter;
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
	private UUID id;

	@NotNull
	@Pattern(regexp = "^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$", message = "Whatsapp inválido!")
	//@Column(unique = true)
	private String usuario;
	
	@NotNull
	//@Column(length = 60, nullable = false)
	private String senha;
	
	@Setter
	@Builder.Default
	private boolean validado = false;
	
	//@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	//@JoinColumn(name = "codigoConfirmacao_id", referencedColumnName = "id")
	private CodigoConfirmacao codigoConfirmacao;

	public Credencial(String usuario, @NotNull String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public void gerarCodigoConfirmacao() {
		this.codigoConfirmacao = new CodigoConfirmacao().generateCode();
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
