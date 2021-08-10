package dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaClareza;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JornadaClarezaFabrica implements EtapaJornadaAtitudeWakanderFabrica {
	@Override
	public EtapaJornadaAtitudeWakander cria(EtapaJornadaAtitudeWakanda etapaWakanda) {
		log.info("[Inicia] JornadaClarezaFabrica - cria EtapaWakanda");
		log.info("[Finaliza] JornadaClarezaFabrica - cria EtapaWakanda");
		return new JornadaClareza(etapaWakanda);
	}

	@Override
	public String getCodigoEtapa() {
		log.info("[Inicia] JornadaClarezaFabrica - getCodigoEtapa");
		log.info("[Finaliza] JornadaClarezaFabrica - getCodigoEtapa");
		return CodigoEtapaJornadaAtitude.JORNADA_CLAREZA.name();
	}
}
