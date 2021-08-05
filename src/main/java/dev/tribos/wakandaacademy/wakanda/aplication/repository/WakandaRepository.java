package dev.tribos.wakandaacademy.wakanda.aplication.repository;

import dev.tribos.wakandaacademy.wakanda.domain.jornadaatitude.JornadaAtitudeWakanda;

import java.util.List;

public interface WakandaRepository {

   List<JornadaAtitudeWakanda> findByPadrao();
}
