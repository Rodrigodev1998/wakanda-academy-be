package dev.tribos.wakandaacademy.credencial.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@RestController
@RequestMapping("public/v1/credencial")
public interface CredencialAPI {
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void criaCredencial(@RequestBody @Valid CredencialForm credencialForm);

	
}
