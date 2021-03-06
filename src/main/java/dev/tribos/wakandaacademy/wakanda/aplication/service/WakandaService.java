package dev.tribos.wakandaacademy.wakanda.aplication.service;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;

public interface WakandaService {
	Wakanda getWakanda();
	void iniciaWakanda() throws Exception;
	Wakanda save(Wakanda wakanda);
	void adicionaEtapaJornadaAtitude(EtapaJornadaAtitudeWakanda etapaJornadaAtitudeWakanda);
}