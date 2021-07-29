package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.api.JornadaDaCompetenciaDTO;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain.JornadaDaCompetencia;

public interface JornadaDaCompetenciaRepository extends MongoRepository<JornadaDaCompetencia, String> {

	List<JornadaDaCompetencia> findByCodigo(String codigoWakander);

}
