package dev.tribos.wakandaacademy.wakander.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class WakanderSpringDataMongoDBService implements WakanderService {
	private WakanderRepository wakanderRepository;

	@Override
	public Wakander criaWakander(Wakander wakander) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
		Wakander wakanderSalvo = wakanderRepository.save(wakander);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
		return wakanderSalvo;
	}

	@Override
	public List<Wakander> buscaWakanderPorEmail(String email) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - buscaWakanderPorEmail");
		List<Wakander> listaDeEmail = this.wakanderRepository.findByEmail(email);

		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - buscaWakanderPorEmail");
		return listaDeEmail;
	}
}
