package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain;

public class JornadaCompetenciaController {
	
	package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.api;

	import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.service.JornadaDaCompetenciaService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

	@Log4j2
	@RestController
	@AllArgsConstructor
	public class JornadaDaCompetenciaRestController {
		@Autowired
		private JornadaDaCompetenciaService jornadaDaCompetenciaService;
		//private Wakander wankander;

		@Override
		public ResponseEntity<JornadaDaCompetenciaDTO> jornandaDaCompetencia(JornadaDaCompetenciaForm jornadaDaCompetenciaForm, UriComponentsBuilder uriBuilder) {

			log.info("[Inicia] WakanderRestController - jornadaDaCompetencia");
			JornadaDaCompetencia jornadaDaCompetencia = jornadaDaCompetenciaForm.converter();

			jornadaDaCompetenciaService.save(jornadaDaCompetencia);

			URI uri = uriBuilder.path("/vi/{wakanderCodigo}/jornada-clareza/jornada-competencia")
					.buildAndExpand(jornadaDaCompetencia.getCodigo()).toUri();
			log.info("[Finaliza] WakanderRestController - jornadaDaCompetencia");
			return ResponseEntity.created(uri).body(new JornadaDaCompetenciaDTO(jornadaDaCompetencia));

		}
	     // aqui ira receber o email do Wakander da pagina
//		String email = null;
//		String wakanderCodigo = jornadaDaCompetenciaService.buscaWakanderPorEmail(email);
		
		@Override
		public List<JornadaDaCompetenciaDTO> lista(String wakanderCodigo) {
			log.info("[Inicia] JornadaDaCompetenciaRestController - buscaCodigoWakander");
			List<JornadaDaCompetencia> jornada = jornadaDaCompetenciaService
					.buscaJornadaDaCompetencia(wakanderCodigo);
			log.info("[Finaliza] WakanderRestController - buscaCodigoWakander");

			return JornadaDaCompetenciaDTO.converter(jornada);
		}}

}
