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
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.CodigoEtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.JornadaAtitudeStrategy;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaClareza;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Getter
@Builder
@Document(collection = "Wakander")
@Log4j2
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

	private LocalDateTime dataHora;

	private JornadaAtitudeWakander jornadaAtitudeWakander;

	@Default
	private StatusWakander statusWakander = StatusWakander.NAO_AUTORIZADO;

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

	public void iniciaWakanda(Wakanda wakanda, JornadaAtitudeStrategy strategy) {
		log.info("[Inicia] Wakander - iniciaWakanda");
		this.jornadaAtitudeWakander = new JornadaAtitudeWakander(wakanda, strategy);
		log.info("[Finaliza] Wakander - iniciaWakanda");
	}

	public void preencheEtapaJornadaAtitude(EtapaJornadaAtitudeWakander etapaJornadaAtitude) {
		jornadaAtitudeWakander.preencheEtapaJornadaAtitude(etapaJornadaAtitude);
	}

	public EtapaJornadaAtitudeWakander procuraEtapaPeloNome(String nome) {
		return jornadaAtitudeWakander.procuraEtapaPeloNome(nome);
	}

<<<<<<< HEAD
	public JornadaDaCompetencia getJornadaCompetencia() {
		return (JornadaDaCompetencia)this.getJornadaAtitudeWakander()
				.procuraEtapaPeloCodigo(CodigoEtapaJornadaAtitude.JORNADA_COMPETENCIA);
	}
	
	public JornadaClareza getJornadaClareza() {
		return (JornadaClareza)this.getJornadaAtitudeWakander()
				.procuraEtapaPeloCodigo(CodigoEtapaJornadaAtitude.JORNADA_CLAREZA);
	}
}
=======
	public void start() {
		this.dataHora = LocalDateTime.now();
	}
}
>>>>>>> develop
