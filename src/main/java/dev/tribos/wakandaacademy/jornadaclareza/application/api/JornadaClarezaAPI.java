package dev.tribos.wakandaacademy.jornadaclareza.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
public interface JornadaClarezaAPI {
	
	@PostMapping("/v1/jornada-clareza/salvaJornadaClareza")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<JornadaClarezaDTO> salvaJornadaClareza(@RequestBody @Valid JornadaClarezaForm jornadaClarezaForm,  
			UriComponentsBuilder uriBuilder );
}
