package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import dev.tribos.wakandaacademy.handler.ApiException;

public class JornadaAtitude {
	List<EtapaJornadaAtitude> etapas;

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