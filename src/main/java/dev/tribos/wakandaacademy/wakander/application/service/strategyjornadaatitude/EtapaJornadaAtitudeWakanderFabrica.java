package dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;

public interface EtapaJornadaAtitudeWakanderFabrica {
	EtapaJornadaAtitudeWakander cria(EtapaJornadaAtitudeWakanda etapaWakanda);
	String getCodigoEtapa();
}
