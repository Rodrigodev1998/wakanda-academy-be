package dev.tribos.wakandaacademy.wakander.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;



@RestController
@RequestMapping("/v1/registro")
public interface WakanderRegistroAPI {
	
	@PostMapping("/pre-cadastro")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<WakanderRegistroDTO> preCadastroWakander(@RequestBody @Valid WakanderRegistroForm wakanderRegistroForm,
			UriComponentsBuilder uriBuilder);

}
