package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface JornadaDaCompetenciaAPI {
	@PatchMapping("/public/v1/wakander/{codigo}/jornada-competencia")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void preencheJornadaDaCompetenciaNoWakander(@PathVariable String codigo,@RequestBody @Valid JornadaDaCompetenciaForm jornadaDaCompetenciaForm);
 
	@GetMapping("/public/v1/wakander/{codigo}/jornada-competencia")
	@ResponseStatus(value = HttpStatus.OK)
	public JornadaDaCompetenciaDTO getJornadaCompetencia(@PathVariable  String codigo);
}
