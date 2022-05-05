package dev.tribos.wakandaacademy.wakanda.aplication.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface WakandaJornadaAtitudeAPI {
	@PatchMapping("/v1/wakanda/jornada-atitude/etapa")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void adicionaEtapaJornadaAtitude(@RequestBody @Valid JornadaAtitudeForm jornadaAtitudeForm);

	@GetMapping("/v1/wakanda/{codigo}/jornada-atitude-wakanda")
	@ResponseStatus(value = HttpStatus.OK)
	public JornadaAtitudeDTO getJornadaAtitude(@PathVariable String codigo);
}
