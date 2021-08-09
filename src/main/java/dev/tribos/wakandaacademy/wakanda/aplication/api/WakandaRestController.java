package dev.tribos.wakandaacademy.wakanda.aplication.api;

import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakanda.aplication.service.WakandaService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class WakandaRestController implements WakandaAPI {
	private WakandaService wakandaService;

	@Override
	public void iniciaWakanda() {
		log.info("[Inicia] WakandaRestController - iniciaWakanda");
		wakandaService.iniciaWakanda();
		log.info("[Finaliza] WakandaRestController - iniciaWakanda");
	}
}
