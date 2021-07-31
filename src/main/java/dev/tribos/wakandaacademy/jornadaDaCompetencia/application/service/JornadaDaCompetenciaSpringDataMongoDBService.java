package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.repository.JornadaDaCompetenciaRepository;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class JornadaDaCompetenciaSpringDataMongoDBService implements JornadaDaCompetenciaService {

	private JornadaDaCompetenciaRepository jornadaDaCompetenciaRepository;
	
	public JornadaDaCompetenciaSpringDataMongoDBService() {}

	@Override
	public JornadaDaCompetencia save(@Valid JornadaDaCompetencia jornadaDaCompetencia) {

		JornadaDaCompetencia jornadaDaCompetenciaSalvo = jornadaDaCompetenciaRepository.save(jornadaDaCompetencia);
		return jornadaDaCompetenciaSalvo;

	}

	@Override
	public String buscaWakanderPorEmail(String emailWakander){
	   Wakander wakander =   jornadaDaCompetenciaRepository.buscaWakanderPorCodigo(emailWakander);
		return wakander.getCodigo();
	}

	@Override
	public List<JornadaDaCompetencia> buscaJornadaDaCompetencia(String codigo) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - buscaWakanderPorCodigo");
		@SuppressWarnings("unchecked")
		List<JornadaDaCompetencia> jornadas = (List<JornadaDaCompetencia>)
				this.jornadaDaCompetenciaRepository
				.findByCodigo(codigo);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - buscaWakanderPorCodigo");
		return jornadas;
	}

	
}
