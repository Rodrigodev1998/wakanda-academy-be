package dev.tribos.wakandaacademy.jornadaDaCompetencia;

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

@RestController
public interface JornadaDaCompetenicaAPI {
	
	
	@PostMapping("/public/v1/wakander/{wakanderCodigo}/jornada-competencia")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<JornadaDaCompetenciaDTO> cadastraJornandaDaCompetencia(String codigo,
			@RequestBody @Valid JornadaDaCompetenciaForm jornadaDaCompetenciaForm);

	@GetMapping("/public/v1/wakander/{wakanderCodigo}/jornada-competencia")
	@ResponseStatus(value = HttpStatus.OK)
	public List<JornadaDaCompetenciaDTO> listaJornadaCompetencia(@RequestParam(required = true) String codigoWakander);
}
