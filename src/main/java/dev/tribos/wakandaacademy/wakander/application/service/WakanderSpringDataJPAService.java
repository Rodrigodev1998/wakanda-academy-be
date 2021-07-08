package dev.tribos.wakandaacademy.wakander.application.service;

import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class WakanderSpringDataJPAService implements WakanderService {
	private WakanderRepository wakanderRepository;

	@Override
	public Wakander criaWakander(Wakander wakander) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
		Wakander wakanderSalvo = wakanderRepository.save(wakander);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
		return wakanderSalvo;
	}
}
