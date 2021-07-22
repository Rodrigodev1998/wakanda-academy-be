package dev.tribos.wakandaacademy.credencial.application.api;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandaacademy.credencial.application.service.CredencialService;
import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
@AllArgsConstructor
public class CredencialRestController implements CredencialAPI{
	private CredencialService credencialService;
	
	@Override
	public void criaCredencial(CredencialForm credencialForm) {
		log.info("[Inicia] CredencialRestController - criaCredencial");
		log.info("CredencialForm - {}", credencialForm);
		Credencial credencialCriada = credencialService.criaCredencial(credencialForm.toEntityCredencial());
		log.info("[Finaliza] CredencialRestController - criaCredencial");
	}

}
