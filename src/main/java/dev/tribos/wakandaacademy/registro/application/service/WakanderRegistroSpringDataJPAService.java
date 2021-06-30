package dev.tribos.wakandaacademy.registro.application.service;

import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.registro.application.repository.RegistroRepository;
import dev.tribos.wakandaacademy.registro.domain.Wakander;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class WakanderRegistroSpringDataJPAService implements WakanderRegistroService {

	private RegistroRepository registroRepository;

	@Override
	public Wakander preCadastroWakander(Wakander registro) {

		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");

		Wakander retroSalva = salvaRegistro(registro);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
		return retroSalva;
	}

	private Wakander salvaRegistro(Wakander registro) {
		return registroRepository.save(registro);
	}

}
