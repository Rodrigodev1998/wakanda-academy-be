package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.api;

import java.util.List;

import javax.validation.Valid;

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
public interface JornadaDaCompetenciaAPI {

	@PostMapping("/public/v1/wakander/{wakanderCodigo}/jornada-clareza/jornada-competencia")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<JornadaDaCompetenciaDTO> jornandaDaCompetencia(
			@RequestBody @Valid JornadaDaCompetenciaForm jornadaDaCompetenciaForm, UriComponentsBuilder uriBuilder);

	
	
	@GetMapping("/wakander/{codigoWakander/jornada-atitudo/competencia")
	@ResponseStatus(value = HttpStatus.OK)
	public List<JornadaDaCompetenciaDTO> lista(@RequestParam(required = true) String codigoWakander); 
	
	
}
