package dev.tribos.wakandaacademy.wakander.application.api.jornadaclareza;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface JornadaClarezaAPI {
	
	@PostMapping("/v1/jornada-clareza/salvaJornadaClareza")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void salvaJornadaClareza(@RequestBody @Valid JornadaClarezaForm jornadaClarezaForm);
}
