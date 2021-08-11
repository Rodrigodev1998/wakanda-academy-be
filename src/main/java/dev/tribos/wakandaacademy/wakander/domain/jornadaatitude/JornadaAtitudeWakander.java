package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;

import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.JornadaAtitudeStrategy;
import lombok.extern.log4j.Log4j2;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaAtitudeWakander {
	List<EtapaJornadaAtitudeWakander> etapas;
	
	public JornadaAtitudeWakander(Wakanda wakanda, JornadaAtitudeStrategy strategy) {
		var etapasWakandaPadrao = wakanda.getEtapasJornadaAtitudePadrao();
		this.etapas = constroiEtapasWakanderAtravesEtapasWakanda(strategy,etapasWakandaPadrao);
	}

    private List<EtapaJornadaAtitudeWakander> constroiEtapasWakanderAtravesEtapasWakanda(JornadaAtitudeStrategy strategy, List<EtapaJornadaAtitudeWakanda> etapasWakandaPadrao) {
    	log.info("[Inicia] JornadaAtitudeWakander - constroiEtapasWakanderAtravesEtapasWakanda");
    	log.info("[Finaliza] JornadaAtitudeWakander - constroiEtapasWakanderAtravesEtapasWakanda");
    	return etapasWakandaPadrao.stream()
    			.map(e -> criaEtapaWakander(strategy, e))
    			.collect(Collectors.toList());
    }

	private EtapaJornadaAtitudeWakander criaEtapaWakander(JornadaAtitudeStrategy strategy, EtapaJornadaAtitudeWakanda etapaWakanda) {
		log.info("[Inicia] JornadaAtitudeWakander - criaEtapaWakander");
    	log.info("[Finaliza] JornadaAtitudeWakander - criaEtapaWakander");
		return strategy.getFabrica(etapaWakanda.getCodigo())
				.cria(etapaWakanda);
	}

	private void instaciaEtapasSeNulo() {
		etapas = Optional.ofNullable(etapas).orElse(new ArrayList<>());
	}

	public void preencheEtapaJornadaAtitude(EtapaJornadaAtitudeWakander etapaJornadaAtitude) {
		log.info("[Inicia] JornadaAtitudeWakander - preencheEtapaJornadaAtitude");
		EtapaJornadaAtitudeWakander etapaPeloNome = procuraEtapaPeloNome(etapaJornadaAtitude.getNome());
		etapaPeloNome.preenche(etapaJornadaAtitude);
		log.info("[Finaliza] JornadaAtitudeWakander - preencheEtapaJornadaAtitude");
	}

	public EtapaJornadaAtitudeWakander procuraEtapaPeloNome(String nome) {
		log.info("[Inicia] JornadaAtitudeWakander - procuraEtapaPeloNome");
		instaciaEtapasSeNulo();
		log.info("[Finaliza] JornadaAtitudeWakander - procuraEtapaPeloNome");
		return this.etapas.stream()
		.filter(e -> e.getNome().equals(nome))
		.findFirst()
		.orElseThrow(() -> ApiException.throwApiException(HttpStatus.BAD_REQUEST, "Etapa não encontrada"));
	}
}