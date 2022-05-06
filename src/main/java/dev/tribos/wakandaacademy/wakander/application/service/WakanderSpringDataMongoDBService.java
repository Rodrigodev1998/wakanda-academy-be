package dev.tribos.wakandaacademy.wakander.application.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakanda.aplication.service.WakandaService;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import dev.tribos.wakandaacademy.wakander.application.api.preCadastroWakander.WakanderPreCadastroRequest;
import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.JornadaAtitudeStrategy;
import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class WakanderSpringDataMongoDBService implements WakanderService {
	private WakanderRepository wakanderRepository;
	private WakandaService wakandaService;
	private JornadaAtitudeStrategy strategyEtapaJornadaAtitude;

	@Override
	public Wakander criaWakander(@Valid WakanderPreCadastroRequest wakanderPreCadastroRequest) {
		log.info("[Inicia] WakanderSpringDataMongoDBService - preCadastraCidadao");
		Wakander wakander = new Wakander(wakanderPreCadastroRequest);
		Wakander wakanderSalvo = wakanderRepository.save(wakander);
		log.info("[Finaliza] WakanderSpringDataMongoDBService - preCadastraCidadao");
		return wakanderSalvo;
	}

	@Override
	public Wakander buscaWakanderPorEmail(String email) {
		log.info("[Inicia] WakanderSpringDataMongoDBService - buscaWakanderPorEmail");
		Wakander wakanderByEmail = this.wakanderRepository.findByEmail(email)
				.orElseThrow(() -> ApiException.throwApiException(HttpStatus.NOT_FOUND, "Wakander não encontrado!"));
		log.info("[Finaliza] WakanderSpringDataMongoDBService - buscaWakanderPorEmail");
		return wakanderByEmail;
	}
	
	@Override
	public void eventoCredencialCriada(Credencial credencial) {
		Wakander wakander = buscaWakanderPorEmail(credencial.getUsuario());
		vinculaJornadaWakandaAoWakander(wakander);
		wakander.mudaStatusParaCadastrado();
		credencial.setCodigoWakander(wakander.getCodigo());
		wakanderRepository.save(wakander);
	}

	private void vinculaJornadaWakandaAoWakander(Wakander wakander) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - vinculaJornadaWakandaAoWakander");
		Wakanda wakanda = wakandaService.getWakanda();
		wakanda.setJornadaAtitudeStrategy(strategyEtapaJornadaAtitude);
		wakander.iniciaWakanda(wakanda);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - vinculaJornadaWakandaAoWakander");
	}

	@Override
	public Wakander buscaWakanderPorCodigo(String codigoWakander) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - buscaWakanderPorCodigo");
		Wakander wakanderPorCodigo = this.wakanderRepository.buscaWakanderPorCodigo(codigoWakander)
				.orElseThrow(() -> ApiException.throwApiException(HttpStatus.NOT_FOUND, "Wakander não encontrado!"));
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - buscaWakanderPorCodigo");
		return wakanderPorCodigo;
	}

	@Override
	public List<Wakander> buscarWakandersPorStatus() {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - buscarWakanderPorStatusNaoAutorizado");
		List<Wakander> wakanderStatusNaoAutorizado = this.wakanderRepository
				.buscaWakanderPorStatus(StatusWakander.NAO_AUTORIZADO);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - buscarWakanderPorStatusNaoAutorizado");
		return wakanderStatusNaoAutorizado;
	}

	public void preencheEtapaParaWakanderAtravesCodigo(String codigo, EtapaJornadaAtitudeWakander etapa) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - salvaJornadaClareza");
		Wakander wakanderPorCodigo = buscaWakanderPorCodigo(codigo);
		wakanderPorCodigo.preencheEtapaJornadaAtitude(etapa);
		wakanderRepository.save(wakanderPorCodigo);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - salvaJornadaClareza");
	}
}
