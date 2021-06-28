package dev.tribos.wakandaacademy.registro.application.api;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandaacademy.registro.application.service.WakanderRegistroService;
import dev.tribos.wakandaacademy.registro.domain.Registro;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class WakanderRegistroController implements WakanderRegistroAPI {

	private WakanderRegistroService wakanderRegistroService;

	@Override
	public ResponseEntity<WakanderRegistroDTO> preCadastroWakander(WakanderRegistroForm wakanderPreRegistroFormr,
			UriComponentsBuilder uriBuilder) {
		log.info("[Inicia] WakanderPreRegistroDTO - preCadastroWakander");
		Registro registro = wakanderRegistroService.preCadastroWakander(wakanderPreRegistroFormr.toRegistro());
		URI uri = uriBuilder.path("/registro/{id}").buildAndExpand(registro.getId()).toUri();
		log.info("[Finaliza] CidadaoRestController - preCadastraCidadao");
		return ResponseEntity.created(uri).body(new WakanderRegistroDTO(registro));
	}

}
