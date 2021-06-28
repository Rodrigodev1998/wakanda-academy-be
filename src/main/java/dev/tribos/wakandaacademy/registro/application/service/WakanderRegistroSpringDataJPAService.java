package dev.tribos.wakandaacademy.registro.application.service;

import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.registro.application.repository.RegistroRepository;
import dev.tribos.wakandaacademy.registro.domain.Registro;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class WakanderRegistroSpringDataJPAService implements WakanderRegistroService {

	private RegistroRepository registroRepository;

	@Override
	public Registro preCadastroWakander(Registro registro) {

		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");

		Registro retroSalva = salvaRegistro(registro);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
		return retroSalva;
	}

	private Registro salvaRegistro(Registro registro) {
		return registroRepository.save(registro);
	}

}
