package dev.tribos.wakandaacademy.wakander.application.api.wakanderdashboard;

import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@AllArgsConstructor
public class WakanderDashboardRestController implements WakanderDashboardAPI {
	private WakanderService wakanderService;
	
	@Override
	public WakanderDashboardResponse buscaDashboardPorCodigo(String codigoWakander) {
		log.info("[Inicia] WakanderRestController - buscaDashboardPorCodigo");
		Wakander wakander = wakanderService.buscaWakanderPorCodigo(codigoWakander);
		log.info("[Finaliza] WakanderRestController - buscaDashboardPorCodigo");
		return new WakanderDashboardResponse(wakander);
	}

}
