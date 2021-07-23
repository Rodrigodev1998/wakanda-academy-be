package dev.tribos.wakandaacademy.wakander.application.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class WakanderSpringDataMongoDBService implements WakanderService {
	private WakanderRepository wakanderRepository;
	

	@Override
	public Wakander criaWakander(Wakander wakander) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
		Wakander wakanderSalvo = wakanderRepository.save(wakander);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - preCadastraCidadao");
		return wakanderSalvo;
	}

	@Override
	public List<Wakander> buscaWakanderPorEmail(String email) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - buscaWakanderPorEmail");
		List<Wakander> listaDeEmail = this.wakanderRepository.buscaWakanderPorEmailEhPorStatusAutorizado(email);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - buscaWakanderPorEmail");
		return listaDeEmail;
	}

	@Override
	public Wakander findByEmail(String email) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - findByEmail");
		Wakander wakanderByEmail = this.wakanderRepository.findByEmail(email)
				.orElseThrow(() -> ApiException.throwApiException(HttpStatus.NOT_FOUND, "Wakander não encontrado!"));
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - findByEmail");
		return wakanderByEmail;
	}

	@Override
	public Wakander save(Wakander wakander) {
		Wakander wakanderSalvo = wakanderRepository.save(wakander);
		return wakanderSalvo;
	}

	@Override
	public void eventoCredencialCriada(Credencial credencial) {
		Wakander wakander = findByEmail(credencial.getUsuario());
		wakander.mudaStatusParaCadastrado();
		credencial.setCodigoWakander(wakander.getCodigo());
	}
}
