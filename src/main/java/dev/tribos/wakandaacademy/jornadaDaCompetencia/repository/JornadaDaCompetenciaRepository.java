package dev.tribos.wakandaacademy.jornadaDaCompetencia.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.JornadaDaCompetencia;

public interface JornadaDaCompetenciaRepository extends MongoRepository<JornadaDaCompetencia, String> {

	List<JornadaDaCompetencia> findByNome(String nomeJornada);

	// JornadaDaCompetencia save(JornadaDaCompetencia jornadaDaCompetencia);
//	List<JornadaDaCompetencia> buscaJornadaDaCompentencia(String nome);
//	Optional<Wakander> findByEmail(String email);
}
