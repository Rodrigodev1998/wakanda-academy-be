package dev.tribos.wakandaacademy.wakander.application.api.jornadaclareza;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface JornadaClarezaAPI {
	
	@PatchMapping("/v1/wakander/{codigo}/jornada-clareza")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void preencheJornadaClarezaNoWakander(@PathVariable String codigo,@RequestBody @Valid JornadaClarezaForm jornadaClarezaForm);
}
