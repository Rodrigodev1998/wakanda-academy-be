package dev.tribos.wakandaacademy.wakanda.aplication.repository;

import dev.tribos.wakandaacademy.wakanda.domain.JornadaAtitudeWakanda;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WakandaRepository extends MongoRepository<JornadaAtitudeWakanda, String> {

    List<JornadaAtitudeWakanda> findByCodigo( String codigo);

}
