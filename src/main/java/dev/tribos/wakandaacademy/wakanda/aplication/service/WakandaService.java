package dev.tribos.wakandaacademy.wakanda.aplication.service;

import dev.tribos.wakandaacademy.wakanda.domain.jornadaatitude.JornadaAtitudeWakanda;

public interface WakandaService {

    JornadaAtitudeWakanda criaJornadaAtitudeWakanda (JornadaAtitudeWakanda jornadaAtitudeWakanda);

    JornadaAtitudeWakanda save (JornadaAtitudeWakanda jornadaAtitudeWakanda);
}
