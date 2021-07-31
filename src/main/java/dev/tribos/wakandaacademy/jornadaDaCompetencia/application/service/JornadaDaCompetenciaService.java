package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.service;

import java.util.List;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain.JornadaDaCompetencia;

public interface JornadaDaCompetenciaService {

	JornadaDaCompetencia save(JornadaDaCompetencia jornadaDaCompetencia);

	String buscaWakanderPorEmail(String emailWakander);

	List<JornadaDaCompetencia> buscaJornadaDaCompetencia(String codigo);

}
