package dev.tribos.wakandaacademy.wakander.domain;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

<<<<<<< HEAD
import dev.tribos.wakandaacademy.wakander.application.api.FormataDataHora;
=======
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitude;
>>>>>>> develop
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaAtitude;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;

@Getter
@Builder
@Document(collection = "Wakander")
public class Wakander {
	@MongoId(targetType = FieldType.STRING)
	private String codigo;
	
	@NotEmpty(message = "o nome não pode estar vazio")
	private String nome;
	
	@Email(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail")
	@NotEmpty(message = "o email não pode estar vazio")
	private String email;
	
	@Positive
	@Max(value = 100, message = "idade não pode ser maior que 100")
	private Integer idade;

	@NotEmpty
	@Pattern(regexp = "^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$", message = "o numero de celular  deve ser valido")
	private String whatsapp;
	
	private TipoRelacionamento relacionamento;
	
	private Boolean possuiFilhos;

	private PreCadastroWakander preCadastro;
	
	private JornadaAtitude jornadaAtitude;
	
	private String dataHora = FormataDataHora.formataDiaHora(LocalDateTime.now());
	

	@Default  
	private  StatusWakander statusWakander = StatusWakander.NAO_AUTORIZADO;

	public void mudaStatusParaCadastrado() {
		this.statusWakander = StatusWakander.CADASTRADO;
	}

	public void buildCodigoByEmail() {
		String primeiraParteDoEmail = getFirstPartOfEmail();
		this.codigo = primeiraParteDoEmail.replaceAll("\\W", "");
	}

	private String getFirstPartOfEmail() {
		return Optional.ofNullable(this.email)
				.map(s -> s.split("@")[0])
				.orElseThrow();
	}

	public void preencheEtapaJornadaAtitude(EtapaJornadaAtitude etapaJornadaAtitude) {
		jornadaAtitude.preencheEtapaJornadaAtitude(etapaJornadaAtitude);
	}
	
	public EtapaJornadaAtitude procuraEtapaPeloNome(String nome) {
		return jornadaAtitude.procuraEtapaPeloNome(nome);
	}
}