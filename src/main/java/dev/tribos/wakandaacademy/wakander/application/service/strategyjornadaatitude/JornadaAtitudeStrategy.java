package dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class JornadaAtitudeStrategy {
	List<EtapaJornadaAtitudeWakanderFabrica> factorys;
	
	public EtapaJornadaAtitudeWakanderFabrica getFabrica(String codigo) {
		return factorys.stream()
				.filter(f -> f.getCodigoEtapa().equals(codigo))
				.findAny()
				.orElseThrow();
	}
}