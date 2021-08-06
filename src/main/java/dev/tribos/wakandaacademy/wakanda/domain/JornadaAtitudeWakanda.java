package dev.tribos.wakandaacademy.wakanda.domain;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class JornadaAtitudeWakanda {

    List<EtapaJornadaAtitudeWakanda> etapas;

    public List<EtapaJornadaAtitudeWakanda> getEtapasPadrao() {
        return null;
    }
}
