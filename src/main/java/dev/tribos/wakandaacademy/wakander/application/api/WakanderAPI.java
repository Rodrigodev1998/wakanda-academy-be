package dev.tribos.wakandaacademy.wakander.application.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public interface WakanderAPI {

	@PostMapping("/public/v1/wakander/pre-cadastro")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<WakanderPreCadastroDTO> preCadastraWakander(
			@RequestBody @Valid WakanderPreCadastroForm wakanderPreCadastroForm, UriComponentsBuilder uriBuilder);

	@GetMapping("/public/v1/wakander")
	@ResponseStatus(value = HttpStatus.OK)
	List<WakanderDetalheDTO> buscaPorEmail(
			@RequestParam(required = false) @Pattern(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail") String gmail);
	
	
	@GetMapping("/public/v1/wakander")
	@ResponseStatus(value = HttpStatus.OK)
	List<WakanderDetalheDTO> buscaPorStatus(
			@RequestParam(required = false) @Pattern(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail") String gmail);
	
}
