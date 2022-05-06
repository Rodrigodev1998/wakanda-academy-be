package dev.tribos.wakandaacademy.wakander.application.api;

import java.util.List;

import javax.validation.constraints.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface WakanderAPI {
	@GetMapping("/public/v1/wakander")
	@ResponseStatus(value = HttpStatus.OK)
	WakanderDetalheDTO buscaPorEmail(
			@RequestParam(required = false) @Pattern(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail") String gmail);

	@GetMapping("/public/v1/pre-cadastros")
	@ResponseStatus(value = HttpStatus.OK)
	List<WakanderBuscaStatusDTO> buscaWakandersPreCadastros();
}
