package dev.tribos.wakandaacademy.wakander.application.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakanda.aplication.service.WakandaService;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.JornadaAtitudeStrategy;
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
	public Wakander criaWakander(@Valid Wakander wakander) {
		log.info("[Inicia] WakanderSpringDataMongoDBService - preCadastraCidadao");
		wakander.buildCodigoByEmail();
		Wakander wakanderSalvo = wakanderRepository.save(wakander);
		log.info("[Finaliza] WakanderSpringDataMongoDBService - preCadastraCidadao");
		return wakanderSalvo;
	}

	private void vinculaJornadaWakandaAoWakander(Wakander wakander) {
		Wakanda wakanda = wakandaService.getWakanda();
		wakander.iniciaWakanda(wakanda,strategyEtapaJornadaAtitude);
	}

	@Override
	public List<Wakander> buscaWakanderPorEmail(String email) {
		log.info("[Inicia] WakanderSpringDataMongoDBService - buscaWakanderPorEmail");
		List<Wakander> listaDeEmail = this.wakanderRepository.buscaWakanderPorEmailEhPorStatusAutorizado(email);
		log.info("[Finaliza] WakanderSpringDataMongoDBService - buscaWakanderPorEmail");
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
		vinculaJornadaWakandaAoWakander(wakander);
		wakander.mudaStatusParaCadastrado();
		credencial.setCodigoWakander(wakander.getCodigo());
		save(wakander);
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
	public void preencheEtapaParaWakanderAtravesCodigo(String codigo, EtapaJornadaAtitudeWakander etapa) {
		log.info("[Inicia] WakanderPreRegistroSpringDataJPAService - salvaJornadaClareza");
		Wakander wakanderPorCodigo = buscaWakanderPorCodigo(codigo);
		wakanderPorCodigo.preencheEtapaJornadaAtitude(etapa);
		this.save(wakanderPorCodigo);
		log.info("[Finaliza] WakanderPreRegistroSpringDataJPAService - salvaJornadaClareza");

	}
	
	public Wakander buscaJornadaDaCompetenciaWakander(String codigoWakander) {
	    Wakander wakander =	 this.buscaWakanderPorCodigo(codigoWakander);
		 return wakander;
	}

}
