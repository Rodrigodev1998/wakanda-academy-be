package dev.tribos.wakandaacademy.wakander.application.api.jornadaatitude;

import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.application.api.wakanderdashboard.JornadaAtitudeWakanderDTO;
import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class JornadaAtitudeRestController implements JornadaAtitudeAPI {
	private WakanderService wakanderService;

	@Override
	public JornadaAtitudeWakanderDTO getJornadaAtitudePorCodigoWakander(String codigo) {
		log.info("[Inicia] JornadaAtitudeRestController - getJornadaAtitudePorCodigoWakander");
		log.info("Codigo Wakander: {}",codigo);
		var wakanderPorCodigo = wakanderService.buscaWakanderPorCodigo(codigo);
		log.info("[Finaliza] JornadaAtitudeRestController - getJornadaAtitudePorCodigoWakander");
		return new JornadaAtitudeWakanderDTO(wakanderPorCodigo);
	}
}