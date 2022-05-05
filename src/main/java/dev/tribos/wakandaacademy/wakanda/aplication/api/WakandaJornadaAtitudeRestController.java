package dev.tribos.wakandaacademy.wakanda.aplication.api;

import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakanda.aplication.service.WakandaService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@RestController
public class WakandaJornadaAtitudeRestController implements WakandaJornadaAtitudeAPI {
	private WakandaService wakandaService;

	@Override
	public void adicionaEtapaJornadaAtitude(JornadaAtitudeForm jornadaAtitudeForm) {
		log.info("[inicia] WakandaJornadaAtitudeRestController - adicionaEtapaJornadaAtitude");
		wakandaService.adicionaEtapaJornadaAtitude(jornadaAtitudeForm.paraEntidade());
		log.info("[finaliza] WakandaJornadaAtitudeRestController - adicionaEtapaJornadaAtitude");
	}

    @Override
    public JornadaAtitudeDTO getJornadaAtitude(String codigo) {
//        var wakanda = wakandaService.getWakanda();
        return new JornadaAtitudeDTO();
    }
}
