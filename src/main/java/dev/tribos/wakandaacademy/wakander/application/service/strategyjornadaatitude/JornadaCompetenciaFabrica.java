package dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;

@Component
public class JornadaCompetenciaFabrica implements EtapaJornadaAtitudeWakanderFabrica {
	@Override
	public EtapaJornadaAtitudeWakander cria(EtapaJornadaAtitudeWakanda etapaWakanda) {
		return new JornadaDaCompetencia(etapaWakanda);
	}

	@Override
	public String getCodigoEtapa() {
		return CodigoEtapaJornadaAtitude.JORNADA_COMPETENCIA.name();
	}
}
