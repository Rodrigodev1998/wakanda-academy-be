package dev.tribos.wakandaacademy.wakander.infrastructure;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class WakanderRegistroNoSqlRepository implements WakanderRepository {

	private WakanderRegistroSpringDataMongoDBRepository wakanderRegistroSpringDataMongoDBRepository;

	@Override
	public Wakander save(Wakander registro) {
		log.info("[Inicia] WakanderRegistroNoSqlRepository - save");
		Wakander registroSalvo = wakanderRegistroSpringDataMongoDBRepository.save(registro);
		log.info("[Finaliza] WakanderRegistroNoSqlRepository - save");
		return registroSalvo;
	}

}
