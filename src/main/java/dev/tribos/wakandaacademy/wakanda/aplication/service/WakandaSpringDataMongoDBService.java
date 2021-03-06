package dev.tribos.wakandaacademy.wakanda.aplication.service;

import java.io.File;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Service
public class WakandaSpringDataMongoDBService implements WakandaService{
    private static final String CODIGO_PADRAO = "PADRAO";
    private WakandaRepository wakandaRepository;

    @Override
    public Wakanda getWakanda() {
        log.info("[Inicia] WakandaSpringDataMongoDBService - getWakanda");
        Wakanda wakanda =  wakandaRepository.findWakandaPadrao(CODIGO_PADRAO).orElseThrow();
        log.info("[Finaliza] WakandaSpringDataMongoDBService - getWakanda");
        return wakanda;
    }

	@Override
	@PostConstruct
	public void iniciaWakanda() throws Exception {
		log.info("[Inicia] WakandaSpringDataMongoDBService - iniciaWakanda");
		if(wakandaRepository.findWakandaPadrao(CODIGO_PADRAO).isEmpty()) {
			var wakanda = buildWakanda();
			wakandaRepository.salva(wakanda);
		};
		log.info("[Finaliza] WakandaSpringDataMongoDBService - iniciaWakanda");
	}

	@Override
	public Wakanda save(Wakanda wakanda) {
    	log.info("[Inicia] WakandaSpringDataMongoDBService - Salva Wakanda");
    	Wakanda wakandaSalvo = wakandaRepository.salva(wakanda);
		log.info("[Finaliza] WakandaSpringDataMongoDBService - Salva Wakanda");
		return wakandaSalvo;
	}

	private Wakanda buildWakanda() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Wakanda wakanda = mapper.readValue(
                new File("src/main/resources/documents/Wakanda_padrao.json"),
                Wakanda.class);
        log.info("Wakanda {}",wakanda);
		return wakanda ;
	}

	@Override
	public void adicionaEtapaJornadaAtitude(EtapaJornadaAtitudeWakanda etapaJornadaAtitudeWakanda) {
		log.info("[Inicia] WakandaSpringDataMongoDBService - adicionaEtapaJornadaAtitude");
		 Wakanda wakanda =  this.getWakanda();
		 wakanda.adicionaEtapaJornadaAtitude(etapaJornadaAtitudeWakanda);
		 this.save(wakanda);
		 log.info("[Finaliza] WakandaSpringDataMongoDBService - adicionaEtapaJornadaAtitude");
	}
}
