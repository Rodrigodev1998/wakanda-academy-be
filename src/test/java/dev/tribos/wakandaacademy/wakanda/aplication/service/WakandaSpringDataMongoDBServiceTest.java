package dev.tribos.wakandaacademy.wakanda.aplication.service;

import org.junit.jupiter.api.Test;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;

class WakandaSpringDataMongoDBServiceTest {
	WakandaSpringDataMongoDBService wakandaService;

	public WakandaSpringDataMongoDBServiceTest() {
		WakandaRepository wakandaRepository = new WakandaTestRepository();
		this.wakandaService = new WakandaSpringDataMongoDBService(wakandaRepository );
	}

	@Test
	void deveIniciarWakandaComSucesso() throws Exception {
		this.wakandaService.iniciaWakanda();
	}
}
