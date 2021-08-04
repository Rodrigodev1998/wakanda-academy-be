package dev.tribos.wakandaacademy.wakanda.aplication.service;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.jornadaatitude.JornadaAtitudeWakanda;

import javax.validation.Valid;

public class WakandaSpringDataMongoDBService implements WakandaService{

    private WakandaRepository wakandaRepository;

    @Override
    public JornadaAtitudeWakanda criaJornadaAtitudeWakanda(@Valid JornadaAtitudeWakanda jornadaAtitudeWakanda) {
//        log.info("[Inicia] ?");
        jornadaAtitudeWakanda.getCodigo();
        JornadaAtitudeWakanda jornadaAtitudeSalva = wakandaRepository.save(jornadaAtitudeWakanda);
//        log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
        return jornadaAtitudeSalva;
    }

    @Override
    public JornadaAtitudeWakanda save(JornadaAtitudeWakanda jornadaAtitudeWakanda) {
        JornadaAtitudeWakanda jornadaAtitudeSalva = wakandaRepository.save(jornadaAtitudeWakanda);
        return jornadaAtitudeSalva;
    }
}
