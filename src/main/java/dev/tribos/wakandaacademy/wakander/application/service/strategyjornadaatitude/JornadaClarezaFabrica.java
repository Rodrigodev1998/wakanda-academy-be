package dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaclareza.JornadaClareza;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JornadaClarezaFabrica implements EtapaJornadaAtitudeWakanderFabrica {
	@Override
	public EtapaJornadaAtitudeWakander cria(EtapaJornadaAtitudeWakanda etapaWakanda) {
		log.info("[Inicia] JornadaClarezaFabrica - cria EtapaWakanda");
		JornadaClareza jornadaClareza = new JornadaClareza(etapaWakanda);
		log.info("[Finaliza] JornadaClarezaFabrica - cria EtapaWakanda");
		return jornadaClareza;
	}

	@Override
	public String getCodigoEtapa() {
		log.info("[Inicia] JornadaClarezaFabrica - getCodigoEtapa");
		String codigoEtapa = CodigoEtapaJornadaAtitude.JORNADA_CLAREZA.name();
		log.info("[Finaliza] JornadaClarezaFabrica - getCodigoEtapa");
		return codigoEtapa;
	}
}
