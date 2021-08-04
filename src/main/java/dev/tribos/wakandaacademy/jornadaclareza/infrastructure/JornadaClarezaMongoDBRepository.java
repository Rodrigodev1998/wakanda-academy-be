package dev.tribos.wakandaacademy.jornadaclareza.infrastructure;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.jornadaclareza.application.repository.JornadaClarezaRepository;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaClareza;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class JornadaClarezaMongoDBRepository implements JornadaClarezaRepository {
	private JornadaClarezaSpringDataMongoDBRepository jornadaClarezaSpringDataMongoDBRepository;
	
	@Override
	public JornadaClareza save(JornadaClareza jornadaClareza) {
		log.info("[Inicia] JornadaClarezaMongoDBRepository - save");
		JornadaClareza jornadaClarezaSalvo = jornadaClarezaSpringDataMongoDBRepository.save(jornadaClareza);
		log.info("[Finaliza] JornadaClarezaMongoDBRepository - save");
		return jornadaClarezaSalvo;
	}
}
