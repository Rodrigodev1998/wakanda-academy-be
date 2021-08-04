package dev.tribos.wakandaacademy.wakander.application.api.jornadaclareza;

import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.jornadaclareza.application.service.JornadaClarezaService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class JornadaClarezaRestController implements JornadaClarezaAPI {
	private JornadaClarezaService jornadaClarezaService;
	
	@Override
	public void salvaJornadaClareza(JornadaClarezaForm jornadaClarezaForm) {
		log.info("[Inicia] JornadaClarezaRestController - jornadaClareza");
		log.info("Form: {}", jornadaClarezaForm);
		jornadaClarezaService.criaJornadaClareza(jornadaClarezaForm.paraEntidade());
		log.info("[Finaliza] JornadaClarezaRestController - jornadaClareza");
	}
}
