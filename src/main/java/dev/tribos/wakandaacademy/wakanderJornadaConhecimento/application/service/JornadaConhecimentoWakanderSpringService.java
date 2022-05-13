package dev.tribos.wakandaacademy.wakanderJornadaConhecimento.application.service;

import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.JornadaConhecimentoWakander;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class JornadaConhecimentoWakanderSpringService implements JornadaConhecimentoWakanderService {

	@Override
	public void criaJornadaConhecimentoWakander(Wakander wakander, Wakanda wakanda) {
		log.info("[inicia] JornadaConhecimentoWakanderService - criaJornadaConhecimentoWakander");
		var jornadaConhecimentoWakander = new JornadaConhecimentoWakander(wakander,wakanda);
		log.info("Jornada Conhecimento Wakander: {}",jornadaConhecimentoWakander);
		log.info("[finaliza] JornadaConhecimentoWakanderService - criaJornadaConhecimentoWakander");
	}
}
