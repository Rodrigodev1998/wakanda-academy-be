package dev.tribos.wakandaacademy.wakander.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.List;

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
}
