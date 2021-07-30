package dev.tribos.wakandaacademy.jornadaclareza.infrastructure;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.jornadaclareza.application.repository.JornadaClarezaRepository;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;
import dev.tribos.wakandaacademy.wakander.infrastructure.WakanderSpringDataMongoDBRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class JornadaClarezaMongoDBRepository implements JornadaClarezaRepository {
	private JornadaClarezaSpringDataMongoDBRespository jornadaClarezaSpringDataMongoDBRespository;
	
	@Override
	public JornadaClareza save(JornadaClareza jornadaClareza) {
		log.info("[Inicia] JornadaClarezaMongoDBRepository - save");
		JornadaClareza jornadaClarezaSalvo = jornadaClarezaMongoSpringDataMongoDBRepository.save(jornadaClareza);
		log.info("[Finaliza] JornadaClarezaMongoDBRepository - save");
		return jornadaClarezaSalvo;
	}
}
