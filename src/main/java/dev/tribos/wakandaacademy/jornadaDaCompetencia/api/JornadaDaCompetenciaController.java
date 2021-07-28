package dev.tribos.wakandaacademy.jornadaDaCompetencia.api;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.repository.JornadaDaCompetenciaRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/wakander")
public class JornadaDaCompetenciaController {
	@Autowired
	private JornadaDaCompetenciaRepository jornadaDaCompetenciaRepository;

	@PostMapping
	public ResponseEntity<JornadaDaCompetenciaDto> cadastra(@RequestBody @Valid JornadaDaCompetenciaForm form, UriComponentsBuilder uriBuilder) {
		
		JornadaDaCompetencia jornadaDaCompetencia = form.converter();
		
		jornadaDaCompetenciaRepository.save(jornadaDaCompetencia);
		
		
		// ver direitinho com Mirian sobre esse path, talvez nem seja necessario isto
		URI uri = uriBuilder.path("/wakander/{id}").buildAndExpand(jornadaDaCompetencia.getCodigo()).toUri();
		
		return ResponseEntity.created(uri).body(new JornadaDaCompetenciaDto(jornadaDaCompetencia));
		// return (ResponseEntity<JornadaDaCompetenciaDto>) ResponseEntity.ok();
		// conversar com Mirian sobre essa linha:
		// elaborá-la melhor. pois aqui tem que retornar code 201
	}

	@GetMapping // ("/wakander/{codigoWakander}/jornada-atitude/competencia") ?? Perguntar se
				// aqui haverá um mapeamento diferente
	public List<JornadaDaCompetenciaDto> listaJornada(String nomeJornada) {
		List<JornadaDaCompetencia> jornadas = jornadaDaCompetenciaRepository.findByNome(nomeJornada);
		return JornadaDaCompetenciaDto.converter(jornadas);

	}
}
