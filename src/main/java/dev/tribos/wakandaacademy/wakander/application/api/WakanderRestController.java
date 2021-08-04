package dev.tribos.wakandaacademy.wakander.application.api;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.JornadaDaCompetenciaDTO;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.JornadaDaCompetenciaForm;
import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class WakanderRestController implements WakanderAPI {
	@Autowired
	private WakanderService wakanderService;

	@Override
	public ResponseEntity<WakanderPreCadastroDTO> preCadastraWakander(WakanderPreCadastroForm wakanderPreCadastroForm,
			UriComponentsBuilder uriBuilder) {
		log.info("[Inicia] WakanderRestController - preCadastraWakander");
		Wakander wakander = wakanderService.criaWakander(wakanderPreCadastroForm.paraEntidade());
		URI uri = uriBuilder.path("/wakander/{id}").buildAndExpand(wakander.getCodigo()).toUri();
		log.info("[Finaliza] WakanderRestController - preCadastraWakander");
		return ResponseEntity.created(uri).body(new WakanderPreCadastroDTO(wakander));
	}

	@Override
	public List<WakanderDetalheDTO> buscaPorEmail(String gmail) {
		log.info("[Inicia] WakanderRestController - buscaEmail");
		List<Wakander> wakanders = wakanderService.buscaWakanderPorEmail(gmail);
		log.info("[Finaliza] WakanderRestController - buscaEmail");
		return WakanderDetalheDTO.parseListDTO(wakanders);
	}
	
	@Override
	public ResponseEntity<JornadaDaCompetenciaDTO> cadastraJornandaDaCompetencia(JornadaDaCompetenciaForm jornadaDaCompetenciaForm) {

		log.info("[Inicia] WakanderRestController - jornadaDaCompetencia");
		JornadaDaCompetencia jornadaDaCompetencia = jornadaDaCompetenciaForm.paraEntidade();

		wakanderService.saveJornadaDaCompetencia(jornadaDaCompetencia);

		
		log.info("[Finaliza] WakanderRestController - jornadaDaCompetencia");
		return ResponseEntity.ok().build();

	}
  
	@Override
	public List<JornadaDaCompetenciaDTO> listaJornadaCompetencia(String wakanderCodigo) {
		log.info("[Inicia] WakanderRestController - buscaCodigoWakander");
		List<JornadaDaCompetencia> jornada = wakanderService.buscaJornadaDaCompetencia(wakanderCodigo);
		log.info("[Finaliza] WakanderRestController - buscaCodigoWakander");

		return JornadaDaCompetenciaDTO.converte(jornada);
	}

	


}
