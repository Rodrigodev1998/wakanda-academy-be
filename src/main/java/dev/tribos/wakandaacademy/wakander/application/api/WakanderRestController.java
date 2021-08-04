package dev.tribos.wakandaacademy.wakander.application.api;

import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Log4j2
@RestController
@AllArgsConstructor
public class WakanderRestController implements WakanderAPI {
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
}
