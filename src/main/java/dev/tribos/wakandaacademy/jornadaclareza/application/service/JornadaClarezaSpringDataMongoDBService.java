package dev.tribos.wakandaacademy.jornadaclareza.application.service;

import org.springframework.stereotype.Service;


import dev.tribos.wakandaacademy.jornadaclareza.application.repository.JornadaClarezaRepository;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class JornadaClarezaSpringDataMongoDBService implements JornadaClarezaService {
	private JornadaClarezaRepository jornadaClarezaRepository;

	@Override
	public JornadaClareza criaJornadaClareza(JornadaClareza jornadaClareza) {
		log.info("Starting Method insert in JornadaClarezaSpringDataMongoDBServiceImp!");
		JornadaClareza jornadaClarezaSalvo = jornadaClarezaRepository.save(jornadaClareza);
		log.info("[Finaliza] JornadaClarezaSpringDataMongoDBService - jornadaClareza");
		return jornadaClarezaSalvo;
	}
}
