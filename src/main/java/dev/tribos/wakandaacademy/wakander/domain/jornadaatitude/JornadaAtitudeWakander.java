package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;

import java.util.List;

public class JornadaAtitudeWakander {

	public JornadaAtitudeWakander(Wakanda wakanda) {
		this.etapas = wakanda.getEtapasJornadaAtitudePadrao();
	}

	List<EtapaJornadaAtitude> etapas;
}