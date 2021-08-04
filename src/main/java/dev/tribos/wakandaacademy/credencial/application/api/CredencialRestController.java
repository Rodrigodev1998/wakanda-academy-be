package dev.tribos.wakandaacademy.credencial.application.api;

import dev.tribos.wakandaacademy.credencial.application.service.CredencialService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
@AllArgsConstructor
public class CredencialRestController implements CredencialAPI{
	private CredencialService credencialService;
	
	@Override
	public void criaCredencial(CredencialForm credencialForm) {
		log.info("[Inicia] CredencialRestController - criaCredencial");
		log.info("CredencialForm - {}", credencialForm);
		credencialService.criaCredencial(credencialForm.toEntityCredencial());
		log.info("[Finaliza] CredencialRestController - criaCredencial");
	}

}
