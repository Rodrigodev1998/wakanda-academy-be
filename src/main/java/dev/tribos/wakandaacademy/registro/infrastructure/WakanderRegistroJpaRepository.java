package dev.tribos.wakandaacademy.registro.infrastructure;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.registro.application.repository.RegistroRepository;
import dev.tribos.wakandaacademy.registro.domain.Registro;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class WakanderRegistroJpaRepository implements RegistroRepository {

	private WakanderRegistroSpringDataRepository wakanderPreRegistroSpringDataRepository;

	@Override
	public Registro save(Registro registro) {
		log.info("[Inicia] CidadaoJpaRepository - save");
		Registro registroSalvo = wakanderPreRegistroSpringDataRepository.save(registro);
		log.info("[Finaliza] CidadaoJpaRepository - save");
		return registroSalvo;
	}

}
