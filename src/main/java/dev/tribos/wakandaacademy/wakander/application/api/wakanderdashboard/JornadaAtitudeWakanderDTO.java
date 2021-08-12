package dev.tribos.wakandaacademy.wakander.application.api.wakanderdashboard;

import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaAtitudeWakander;
import lombok.Value;

@Value
public class JornadaAtitudeWakanderDTO {
	List<EtapaJornadaWakanderDTO> etapas;
	
	public JornadaAtitudeWakanderDTO(JornadaAtitudeWakander jornadaAtitude) {
		this.etapas = jornadaAtitude.getEtapas().stream()
				.map(EtapaJornadaWakanderDTO::new)
				.collect(Collectors.toList());
	}

	public JornadaAtitudeWakanderDTO(Wakander wakanderPorCodigo) {
		this.etapas = wakanderPorCodigo.getEtapasJornadaAtitude().stream()
				.map(EtapaJornadaWakanderDTO::new)
				.collect(Collectors.toList());
	}
}
