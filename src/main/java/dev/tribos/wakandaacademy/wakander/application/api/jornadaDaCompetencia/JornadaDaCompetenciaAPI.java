package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.application.api.WakanderDetalheDTO;

@RestController
public interface JornadaDaCompetenciaAPI {
	
	
	@PatchMapping("/public/v1/wakander/{wakanderCodigo}/jornada-competencia")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void preencheJornadaDaCompetenciaNoWakander(@PathVariable String wakanderCodigo,@RequestBody @Valid JornadaDaCompetenciaForm jornadaDaCompetenciaForm);
 
	@GetMapping("/public/v1/wakander/{wakanderCodigo}/jornada-competencia")
	@ResponseStatus(value = HttpStatus.OK)
	public List<WakanderDetalheDTO> listaJornadaCompetencia(@RequestParam(required = true) String codigoWakander);
}
