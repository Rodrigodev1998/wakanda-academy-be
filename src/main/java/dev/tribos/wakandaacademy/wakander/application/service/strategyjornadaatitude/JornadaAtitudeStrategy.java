package dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
@AllArgsConstructor
public class JornadaAtitudeStrategy {
	List<EtapaJornadaAtitudeWakanderFabrica> factorys;
	
	public EtapaJornadaAtitudeWakanderFabrica getFabrica(String codigo) {
		log.info("[Inicia] JornadaAtitudeStrategy - getFabrica");
		log.info("[Finaliza] JornadaAtitudeStrategy - getFabrica");
		return factorys.stream()
				.filter(f -> f.getCodigoEtapa().equals(codigo))
				.findAny()
				.orElseThrow();
	}
}