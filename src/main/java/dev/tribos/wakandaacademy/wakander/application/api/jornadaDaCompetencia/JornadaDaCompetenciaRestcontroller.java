package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class JornadaDaCompetenciaRestcontroller implements JornadaDaCompetenciaAPI {
	WakanderService wakanderService;

	@Override
	public void preencheJornadaDaCompetenciaNoWakander(@PathVariable String codigo,
			@RequestBody @Valid JornadaDaCompetenciaForm jornadaDaCompetenciaForm) {
		log.info("[Inicia] JornadaDaCompetenciaRestController - jornadaDaCompetencia");
		log.info("Form: {}", jornadaDaCompetenciaForm);
		wakanderService.preencheEtapaParaWakanderAtravesCodigo(codigo, jornadaDaCompetenciaForm.paraEntidade());
		log.info("[Finaliza] JornadaDaCompetenciaRestController - jornadaDaCompetencia");
	}

	@Override
	public JornadaDaCompetenciaDTO getJornadaCompetencia(String codigo) {
		log.info("[Inicia] JornadaDaCompetenciaRestController - jornadaDaCompetencia");
		var wakanderPorCodigo = wakanderService.buscaWakanderPorCodigo(codigo);
		log.info("[Finaliza] JornadaDaCompetenciaRestController - jornadaDaCompetencia");
		return new JornadaDaCompetenciaDTO(wakanderPorCodigo);
	}
}
