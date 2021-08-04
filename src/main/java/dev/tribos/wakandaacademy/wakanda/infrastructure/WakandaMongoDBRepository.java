package dev.tribos.wakandaacademy.wakanda.infrastructure;

import dev.tribos.wakandaacademy.wakanda.domain.jornadaatitude.JornadaAtitudeWakanda;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Log4j2
@Component
public class WakandaMongoDBRepository {

	private WakandaSpringDataMongoDBRepository wakandaSpringDataMongoDBRepository;

	public JornadaAtitudeWakanda save (JornadaAtitudeWakanda jornadaAtitudeWakanda) {
		log.info("[Inicia] WakandaMongoDBRepository - save");
		JornadaAtitudeWakanda jornadaAtitudeWakandaSalva = wakandaSpringDataMongoDBRepository.save(jornadaAtitudeWakanda);
		log.info("[Finaliza] WakandaMongoDBRepository - save");
		return jornadaAtitudeWakandaSalva;
	}
}