package dev.tribos.wakandaacademy.wakander.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class WakanderRestController implements WakanderAPI {
	private WakanderService wakanderService;

	@Override
	public WakanderDetalheDTO buscaPorEmail(String gmail) {
		log.info("[Inicia] WakanderRestController - buscaEmail");
		Wakander wakanderPorEmail = wakanderService.buscaWakanderPorEmail(gmail);
		log.info("[Finaliza] WakanderRestController - buscaEmail");
		return new WakanderDetalheDTO(wakanderPorEmail);
	}

	@Override
	public List<WakanderBuscaStatusDTO> buscaWakandersPreCadastros() {
		log.info("[inicia] WakanderRestController - buscaPorStatus");
		List<Wakander> wakendersNaoAutoruizado = wakanderService.buscarWakandersPorStatus();
		log.info("[Finaliza] WakanderRestController - buscaPorStatus");
		return WakanderBuscaStatusDTO.parseListBuscaStatusDTO(wakendersNaoAutoruizado);
	}
	
}

