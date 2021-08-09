package dev.tribos.wakandaacademy.wakanda.aplication.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface WakandaAPI {
	@PostMapping("/public/v1/wakanda/inicio")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void iniciaWakanda();
}
