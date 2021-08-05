package dev.tribos.wakandaacademy.wakanda.infrastructure;

import dev.tribos.wakandaacademy.wakanda.domain.jornadaatitude.JornadaAtitudeWakanda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WakandaSpringDataMongoDBRepository extends MongoRepository<JornadaAtitudeWakanda,String>{

    List<JornadaAtitudeWakanda> findByPadrao();
}
