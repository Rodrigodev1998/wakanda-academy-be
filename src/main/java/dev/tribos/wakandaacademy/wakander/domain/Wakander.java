package dev.tribos.wakandaacademy.wakander.domain;

import dev.tribos.wakandaacademy.wakanda.aplication.service.WakandaService;
import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaAtitudeWakander;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	private List<JornadaAtitudeWakander> jornadaAtitudeWakander;


	@Default
	private StatusWakander statusWakander = StatusWakander.NAO_AUTORIZADO ;

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

	public void iniciaJornadaDaAtitude(WakanderRepository wakanderRepository, WakandaService wakandaService) {
		log.info("[Inicia] WakanderSpringDataMongoDBService - iniciaJornadaDaAtitude");
		instanciaJornadaDaAtitudeWakanda();
		List<JornadaAtitudeWakander> jornadaDaAtitudeWakanderPadrao = buscaJornadaDaAtitudePadrão(wakandaService);
		this.jornadaAtitudeWakander.addAll(jornadaDaAtitudeWakanderPadrao);
		wakanderRepository.save(this);
		log.info("[Finaliza] WakanderSpringDataMongoDBService - iniciaJornadaDaAtitude");
	}

	private List<JornadaAtitudeWakander>  buscaJornadaDaAtitudePadrão(WakandaService wakandaService) {
		List<EtapaJornadaAtitudeWakanda> jornadaDaAtitudePadrao = wakandaService.buscaPorPadrao();
		return jornadaDaAtitudePadrao.stream().map(ja -> buildJornadaWakander(ja)).collect(Collectors.toList());
	}

	private JornadaAtitudeWakander buildJornadaWakander (EtapaJornadaAtitudeWakanda etapaJornadaAtitudeWakanda) {
		JornadaAtitudeWakander jornadaAtitudeWakander = new JornadaAtitudeWakander(etapaJornadaAtitudeWakanda);
		return jornadaAtitudeWakander;
	}

	private void instanciaJornadaDaAtitudeWakanda() {
		if(this.jornadaDaAtitudeWakanda == null) {
			this.jornadaDaAtitudeWakanda = new ArrayList<EtapaJornadaAtitudeWakanda>();
		}
	}

	public void iniciaWakanda(Wakanda wakanda) {
		log.info("[Inicia] WakanderSpringDataMongoDBService - iniciaJornadaDaAtitude");
		instanciaJornadaDaAtitudeWakanda();
		List<JornadaAtitudeWakander> jornadaDaAtitudeWakanderPadrao = buscaJornadaDaAtitudePadrão(wakandaService);
		this.jornadaAtitudeWakander.addAll(jornadaDaAtitudeWakanderPadrao);
		wakanderRepository.save(this);
		log.info("[Finaliza] WakanderSpringDataMongoDBService - iniciaJornadaDaAtitude");
	}
}