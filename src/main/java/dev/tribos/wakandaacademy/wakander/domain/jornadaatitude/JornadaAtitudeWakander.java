package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;

public class JornadaAtitudeWakander {
	List<EtapaJornadaAtitude> etapas;
	
	public JornadaAtitudeWakander(Wakanda wakanda) {
		this.etapas = wakanda.getEtapasJornadaAtitudePadrao();
	}

	private void instaciaEtapasSeNulo() {
		etapas = Optional.ofNullable(etapas).orElse(new ArrayList<>());
	}

	public void preencheEtapaJornadaAtitude(EtapaJornadaAtitude etapaJornadaAtitude) {
		EtapaJornadaAtitude etapaPeloNome = procuraEtapaPeloNome(etapaJornadaAtitude.getNome());
		etapaPeloNome.preenche(etapaJornadaAtitude);
	}

	public EtapaJornadaAtitude procuraEtapaPeloNome(String nome) {
		instaciaEtapasSeNulo();
		return this.etapas.stream()
		.filter(e -> e.getNome().equals(nome))
		.findFirst()
		.orElseThrow(() -> ApiException.throwApiException(HttpStatus.BAD_REQUEST, "Etapa não encontrada"));
	}
}