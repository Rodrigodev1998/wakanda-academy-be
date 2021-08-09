package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Builder;
import lombok.Value;

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
