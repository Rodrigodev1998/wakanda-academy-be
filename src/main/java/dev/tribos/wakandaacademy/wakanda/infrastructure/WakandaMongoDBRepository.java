package dev.tribos.wakandaacademy.wakanda.infrastructure;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.jornadaatitude.JornadaAtitudeWakanda;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Log4j2
@Component
public class WakandaMongoDBRepository implements WakandaRepository {

	private WakandaSpringDataMongoDBRepository wakandaSpringDataMongoDBRepository;

	@Override
	public List<JornadaAtitudeWakanda> findByPadrao() {
		log.info("[Inicia] WakandaMongoDBRepository - findByPadrao");
		List<JornadaAtitudeWakanda> retornoJornada = wakandaSpringDataMongoDBRepository.findByPadrao();
		log.info("[Finaliza] WakandaMongoDBRepository - findByPadrao");
		return retornoJornada;
	}
}