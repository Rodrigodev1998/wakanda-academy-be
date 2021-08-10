package dev.tribos.wakandaacademy.wakanda.domain;

import lombok.Builder;
import lombok.Value;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.stream.Collectors;


@Value
@Builder
@Log4j2
public class JornadaAtitudeWakanda {
    List<EtapaJornadaAtitudeWakanda> etapas;

    public List<EtapaJornadaAtitudeWakanda> getEtapasPadrao() {
    	log.info("[Inicia] JornadaAtitudeWakanda - getEtapasPadrao");
    	log.info("[Finaliza] JornadaAtitudeWakanda - getEtapasPadrao");
        return etapas.stream()
        		.filter(e -> e.getPadrao())
        		.collect(Collectors.toList());
    }
}
