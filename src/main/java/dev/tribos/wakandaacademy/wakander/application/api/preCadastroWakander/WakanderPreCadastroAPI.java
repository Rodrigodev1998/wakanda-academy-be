package dev.tribos.wakandaacademy.wakander.application.api.preCadastroWakander;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public interface WakanderPreCadastroAPI {
	@PostMapping("/public/v1/wakander/pre-cadastro")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<WakanderPreCadastroResponse> preCadastraWakander(
			@RequestBody @Valid WakanderPreCadastroRequest wakanderPreCadastroForm, UriComponentsBuilder uriBuilder);
}
