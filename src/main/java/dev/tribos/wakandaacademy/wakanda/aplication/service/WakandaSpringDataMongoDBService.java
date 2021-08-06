package dev.tribos.wakandaacademy.wakanda.aplication.service;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@AllArgsConstructor
@Service
public class WakandaSpringDataMongoDBService implements WakandaService{

    private static final String CODIGO = "PADRAO";

    private WakandaRepository wakandaRepository;

    @Override
    public Wakanda getWakanda() {
        log.info("[Inicia] WakandaSpringDataMongoDBService - getWakanda");
        Wakanda wakanda =  wakandaRepository.findWakandaPadrao(CODIGO)
                .orElseThrow();
        log.info("[Finaliza] WakandaSpringDataMongoDBService - getWakanda");
        return wakanda;
    }

}
