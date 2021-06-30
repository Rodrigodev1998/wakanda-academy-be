package dev.tribos.wakandaacademy.registro.infrastructure;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.registro.application.repository.RegistroRepository;
import dev.tribos.wakandaacademy.registro.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class WakanderRegistroJpaRepository implements RegistroRepository {

	private WakanderRegistroSpringDataRepository wakanderPreRegistroSpringDataRepository;

	@Override
	public Wakander save(Wakander registro) {
		log.info("[Inicia] CidadaoJpaRepository - save");
		Wakander registroSalvo = wakanderPreRegistroSpringDataRepository.save(registro);
		log.info("[Finaliza] CidadaoJpaRepository - save");
		return registroSalvo;
	}

}
