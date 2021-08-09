package dev.tribos.wakandaacademy.wakanda.aplication.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.JornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Service
public class WakandaSpringDataMongoDBService implements WakandaService{
    private static final String CODIGO = "PADRAO";
    private WakandaRepository wakandaRepository;

    @Override
    public Wakanda getWakanda() {
        log.info("[Inicia] WakandaSpringDataMongoDBService - getWakanda");
        Wakanda wakanda =  wakandaRepository.findWakandaPadrao(CODIGO)
                .orElseThrow();
        log.info("[Finaliza] WakandaSpringDataMongoDBService - getWakanda");
        return wakanda;
    }

	@Override
	public void iniciaWakanda() {
		if(wakandaRepository.findWakandaPadrao(CODIGO).isEmpty()) {
			var wakanda = buildWakanda();
			wakandaRepository.salva(wakanda);
		};
	}

	private Wakanda buildWakanda() {
		Wakanda wakanda = Wakanda.builder()
				.codigo(CODIGO)
				.jornadaAtitude(JornadaAtitudeWakanda.builder()
						.etapas(buildEtapas())
						.build())
				.build();
		logWakanda(wakanda);
		return wakanda ;
	}

	private void logWakanda(Wakanda wakanda) {
		try {
			String wakandaString = new ObjectMapper().writeValueAsString(wakanda);
			log.info("Wakanda: {}",wakandaString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	private List<EtapaJornadaAtitudeWakanda> buildEtapas() {
		return Arrays.asList(EtapaJornadaAtitudeWakanda.builder()
				.codigo("JORNADA_CLAREZA")
				.build());
	}

}
