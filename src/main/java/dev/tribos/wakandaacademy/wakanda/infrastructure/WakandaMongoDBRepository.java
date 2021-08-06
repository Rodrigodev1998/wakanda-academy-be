package dev.tribos.wakandaacademy.wakanda.infrastructure;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Log4j2
@Component
public class WakandaMongoDBRepository implements WakandaRepository {

	private WakandaSpringDataMongoDBRepository wakandaSpringDataMongoDBRepository;

	@Override
	public Optional<Wakanda> findWakandaPadrao(String codigo) {
		log.info("[Inicia] WakandaMongoDBRepository - findWakandaPadrao");
		Optional<Wakanda> retornoJornada = wakandaSpringDataMongoDBRepository.findById(codigo);
		log.info("[Finaliza] WakandaMongoDBRepository - findWakandaPadrao");
		return retornoJornada;
	}
}