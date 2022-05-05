package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.JornadaAtitudeStrategy;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaAtitudeWakanda {
    private List<EtapaJornadaAtitudeWakanda> etapas;
    @Setter
    private JornadaAtitudeStrategy strategy;
    
    public List<EtapaJornadaAtitudeWakanda> getEtapasPadrao() {
        return etapas.stream()
        		.filter(e -> e.getPadrao())
        		.collect(Collectors.toList());
    }

    public void adicionaEtapaJornadaAtitude(EtapaJornadaAtitudeWakanda etapaJornadaAtitude) {
    	etapas.add(etapaJornadaAtitude);
    }
}
