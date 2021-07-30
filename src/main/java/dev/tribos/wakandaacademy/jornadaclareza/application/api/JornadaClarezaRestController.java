package dev.tribos.wakandaacademy.jornadaclareza.application.api;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandaacademy.jornadaclareza.application.service.JornadaClarezaService;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class JornadaClarezaRestController implements JornadaClarezaAPI {
	private JornadaClarezaService jornadaClarezaService;
	
	
	@Override
	public ResponseEntity<JornadaClarezaDTO> salvaJornadaClareza(JornadaClarezaForm jornadaClarezaForm,
			UriComponentsBuilder uriBuilder) {
		
		log.info("[Inicia] JornadaClarezaRestController - jornadaClareza");
		log.info("Form: {}", jornadaClarezaForm);
		JornadaClareza jornadaClareza = jornadaClarezaService.criaJornadaClareza(jornadaClarezaForm.paraEntidade());
		URI uri = uriBuilder.path("/jornada-clareza").buildAndExpand(jornadaClareza.getCodigo()).toUri();
		log.info("[Finaliza] JornadaClarezaRestController - jornadaClareza");
		return ResponseEntity.created(uri).body(new JornadaClarezaDTO(jornadaClareza));
	}

}
