package dev.tribos.wakandaacademy.wakanda.aplication.service;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.jornadaatitude.JornadaAtitudeWakanda;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@AllArgsConstructor
@Service
public class WakandaSpringDataMongoDBService implements WakandaService{

    private WakandaRepository wakandaRepository;

    @Override
    public List<JornadaAtitudeWakanda> buscaPorPadrao() {
        log.info("[Inicia] WakandaSpringDataMongoDBService - buscaPorPadrao");
        List<JornadaAtitudeWakanda> retornoJornada =  wakandaRepository.findByPadrao();
        log.info("[Finaliza] WakandaSpringDataMongoDBService - buscaPorPadrao");
        return retornoJornada;
    }
}
