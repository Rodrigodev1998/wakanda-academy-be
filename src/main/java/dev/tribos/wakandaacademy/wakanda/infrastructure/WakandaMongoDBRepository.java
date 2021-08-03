package dev.tribos.wakandaacademy.wakanda.infrastructure;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.JornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Log4j2
@Component
public class WakandaMongoDBRepository {

	private WakandaSpringDataMongoDBRepository wakandaSpringDataMongoDBRepository;

	public List<JornadaAtitudeWakanda> findByCodigo(String codigo) {
		return null;
	}
}