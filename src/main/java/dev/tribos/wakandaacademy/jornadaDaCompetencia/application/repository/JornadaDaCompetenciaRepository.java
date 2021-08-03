package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.repository;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;

public interface JornadaDaCompetenciaRepository {
	JornadaDaCompetencia save(JornadaDaCompetencia jornadaDaCompetencia);
	JornadaDaCompetencia findByCodigo(String codigo);
	Wakander buscaWakanderPorCodigo(String emailWakander);

}
