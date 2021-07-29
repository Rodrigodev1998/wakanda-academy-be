package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.api;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.repository.JornadaDaCompetenciaRepository;
import dev.tribos.wakandaacademy.wakander.application.api.WakanderRestController;
import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class JornadaDaCompetenciaController implements JornadaDaCompetenciaAPI {
	@Autowired
	private JornadaDaCompetenciaRepository jornadaDaCompetenciaRepository;

	@Override
	public ResponseEntity<JornadaDaCompetenciaDTO> jornandaDaCompetencia(
			@Valid JornadaDaCompetenciaForm jornadaDaCompetenciaForm, UriComponentsBuilder uriBuilder) {
		JornadaDaCompetencia jornadaDaCompetencia = jornadaDaCompetenciaForm.converter();

		jornadaDaCompetenciaRepository.save(jornadaDaCompetencia);

		URI uri = uriBuilder.path("/vi/{wakanderCodigo}/jornada-clareza/jornada-competencia")
				.buildAndExpand(jornadaDaCompetencia.getCodigo()).toUri();

		return ResponseEntity.created(uri).body(new JornadaDaCompetenciaDTO(jornadaDaCompetencia));
		
	}

	@Override
	public List<JornadaDaCompetenciaDTO> lista(String codigoWakander) {
		List<JornadaDaCompetencia> jornada = jornadaDaCompetenciaRepository.findByCodigo(codigoWakander);
				
		return  JornadaDaCompetenciaDTO.converter(jornada);
	
	}

	
	

}
