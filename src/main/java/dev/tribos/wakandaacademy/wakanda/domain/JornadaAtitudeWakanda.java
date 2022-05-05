package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaAtitudeWakanda {

    List<EtapaJornadaAtitudeWakanda> etapas;

    public List<EtapaJornadaAtitudeWakanda> getEtapasPadrao() {
        return etapas.stream()
        		.filter(e -> e.getPadrao())
        		.collect(Collectors.toList());
    }

    public void adicionaEtapaJornadaAtitude(EtapaJornadaAtitudeWakanda etapaJornadaAtitude) {
    	etapas.add(etapaJornadaAtitude);
    }
}
