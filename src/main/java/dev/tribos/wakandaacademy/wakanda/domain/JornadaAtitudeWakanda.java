package dev.tribos.wakandaacademy.wakanda.domain;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
@Builder
public class JornadaAtitudeWakanda {
    List<EtapaJornadaAtitudeWakanda> etapas;

    public List<EtapaJornadaAtitudeWakanda> getEtapasPadrao() {
        return etapas.stream()
        		.filter(e -> e.getPadrao())
        		.collect(Collectors.toList());
    }
}
