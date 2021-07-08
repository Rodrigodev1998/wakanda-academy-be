package dev.tribos.wakandaacademy.wakander.infrastructure;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class WakanderMongoDBRepository implements WakanderRepository {
	private WakanderSpringDataMongoDBRepository wakanderSpringDataMongoDBRepository;

	@Override
	public Wakander save(Wakander wakander) {
		log.info("[Inicia] WakanderMongoDBRepository - save");
		Wakander wakanderSalvo = wakanderSpringDataMongoDBRepository.save(wakander);
		log.info("[Finaliza] WakanderMongoDBRepository - save");
		return wakanderSalvo;
	}
}
