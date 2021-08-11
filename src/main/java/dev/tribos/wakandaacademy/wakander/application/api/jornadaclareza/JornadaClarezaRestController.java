package dev.tribos.wakandaacademy.wakander.application.api.jornadaclareza;

import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class JornadaClarezaRestController implements JornadaClarezaAPI {
	private WakanderService wakanderService;
	
	@Override
	public void preencheJornadaClarezaNoWakander(String codigo, JornadaClarezaForm jornadaClarezaForm) {
		log.info("[Inicia] JornadaClarezaRestController - jornadaClareza");
		log.info("Form: {}", jornadaClarezaForm);
		wakanderService.preencheEtapaParaWakanderAtravesCodigo(codigo,jornadaClarezaForm.paraEntidade());
		log.info("[Finaliza] JornadaClarezaRestController - jornadaClareza");
	}
	
	@Override
	public JornadaClarezaDTO getJornadaClareza(String codigoWakander) {
		log.info("[Inicia] JornadaClarezaRestController - jornadaClareza");
		var wakanderPorCodigo = wakanderService.buscaWakanderPorCodigo(codigoWakander);
		log.info("[Finaliza] JornadaCompetenciaRestController - jornadaClareza");
		return new JornadaClarezaDTO(wakanderPorCodigo);
	}
	
}