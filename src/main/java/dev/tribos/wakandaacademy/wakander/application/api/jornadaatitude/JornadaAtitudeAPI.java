package dev.tribos.wakandaacademy.wakander.application.api.jornadaatitude;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.application.api.wakanderdashboard.JornadaAtitudeWakanderDTO;

@RestController
public interface JornadaAtitudeAPI {
	@GetMapping("/v1/wakander/{codigo}/jornada-atitude")
	@ResponseStatus(value = HttpStatus.OK)
	public JornadaAtitudeWakanderDTO getJornadaAtitudePorCodigoWakander(@PathVariable String codigo);
}