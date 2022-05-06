package dev.tribos.wakandaacademy.wakander.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import dev.tribos.wakandaacademy.wakander.application.api.preCadastroWakander.WakanderPreCadastroRequest;
import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.CodigoEtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaclareza.JornadaClareza;
import dev.tribos.wakandaacademy.wakander.domain.jornadaconhecimento.JornadaConhecimentoWakander;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Wakander")
@Log4j2
public class Wakander {
	@MongoId(targetType = FieldType.STRING)
	private String codigo;

	@NotEmpty(message = "o nome não pode estar vazio")
	private String nome;

	@Email(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail")
	@NotEmpty(message = "o email não pode estar vazio")
	@Indexed(unique=true)
	private String email;

	@NotEmpty
	@Pattern(regexp = "^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$", message = "o numero de celular  deve ser valido")
	@Indexed(unique=true)
	private String whatsapp;

	private LocalDateTime dataHoraCriacao;

	private JornadaAtitudeWakander jornadaAtitudeWakander;

	private JornadaConhecimentoWakander jornadaConhecimentoWakander;

	private StatusWakander statusWakander;

	public Wakander(WakanderPreCadastroRequest wakanderPreCadastroRequest) {
		this.buildCodigoByEmail();
		this.dataHoraCriacao = LocalDateTime.now();
		this.statusWakander = StatusWakander.AUTORIZADO;
	}

	public void mudaStatusParaCadastrado() {
		log.info("[Inicia] Wakander - mudaStatusParaCadastrado");
		this.statusWakander = StatusWakander.CADASTRADO;
		log.info("[Finaliza] Wakander - mudaStatusParaCadastrado");
	}

	public void buildCodigoByEmail() {
		log.info("[Inicia] Wakander - buildCodigoByEmail");
		String primeiraParteDoEmail = getFirstPartOfEmail();
		this.codigo = primeiraParteDoEmail.replaceAll("\\W", "");
		log.info("[Finaliza] Wakander - buildCodigoByEmail");
	}

	private String getFirstPartOfEmail() {
		return Optional.ofNullable(this.email)
				.map(s -> s.split("@")[0])
				.orElseThrow();
	}

	public void iniciaWakanda(Wakanda wakanda) {
		log.info("[Inicia] Wakander - iniciaWakanda");
		this.jornadaAtitudeWakander = new JornadaAtitudeWakander(wakanda);
		this.jornadaConhecimentoWakander = new JornadaConhecimentoWakander(wakanda);
		log.info("[Finaliza] Wakander - iniciaWakanda");
	}

	public void preencheEtapaJornadaAtitude(EtapaJornadaAtitudeWakander etapaJornadaAtitude) {
		log.info("[Inicia] Wakander - preencheEtapaJornadaAtitude");
		jornadaAtitudeWakander.preencheEtapaJornadaAtitude(etapaJornadaAtitude);
		log.info("[Finaliza] Wakander - preencheEtapaJornadaAtitude");
	}

	public JornadaDaCompetencia getJornadaCompetencia() {
		return (JornadaDaCompetencia)this.getJornadaAtitudeWakander()
				.procuraEtapaPeloCodigo(CodigoEtapaJornadaAtitude.JORNADA_COMPETENCIA);
	}
	
	public JornadaClareza getJornadaClareza() {
		return (JornadaClareza)this.getJornadaAtitudeWakander()
				.procuraEtapaPeloCodigo(CodigoEtapaJornadaAtitude.JORNADA_CLAREZA);
	}

	public List<EtapaJornadaAtitudeWakander> getEtapasJornadaAtitude() {
		return this.jornadaAtitudeWakander.getEtapas();
	}
}

