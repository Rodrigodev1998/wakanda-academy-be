package dev.tribos.wakandaacademy.jornadaDaCompetencia.repository;

import java.util.List;
import java.util.Optional;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;

public interface JornadaDaCompetenciaRepository {
	JornadaDaCompetencia save(JornadaDaCompetencia jornadaDaCompetencia);
	List<JornadaDaCompetencia> buscaJornadaDaCompentencia(String nome);
	Optional<Wakander> findByEmail(String email);
}
