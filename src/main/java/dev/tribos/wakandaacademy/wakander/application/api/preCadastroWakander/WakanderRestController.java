package dev.tribos.wakandaacademy.wakander.application.api.preCadastroWakander;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class WakanderRestController implements WakanderPreCadastroAPI {
	private final WakanderService wakanderService;

	@Override
	public ResponseEntity<WakanderPreCadastroResponse> preCadastraWakander(WakanderPreCadastroRequest wakanderPreCadastroRequest,
			UriComponentsBuilder uriBuilder) {
		log.info("[Inicia] WakanderRestController - preCadastraWakander");
		Wakander wakander = wakanderService.criaWakander(wakanderPreCadastroRequest);
		URI uri = uriBuilder.path("/wakander/{id}").buildAndExpand(wakander.getCodigo()).toUri();
		log.info("[Finaliza] WakanderRestController - preCadastraWakander");
		return ResponseEntity.created(uri).body(new WakanderPreCadastroResponse(wakander));
	}
}

