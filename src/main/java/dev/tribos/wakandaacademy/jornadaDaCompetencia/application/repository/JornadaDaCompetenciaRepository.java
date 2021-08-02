package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;

public interface JornadaDaCompetenciaRepository extends MongoRepository<JornadaDaCompetencia, String>{
	//JornadaDaCompetencia save(JornadaDaCompetencia jornadaDaCompetencia);
	JornadaDaCompetencia findByCodigo(String codigo);
	Wakander buscaWakanderPorCodigo(String emailWakander);

}
