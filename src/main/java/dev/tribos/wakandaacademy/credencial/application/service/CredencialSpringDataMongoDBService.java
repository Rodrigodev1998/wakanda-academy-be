package dev.tribos.wakandaacademy.credencial.application.service;

import dev.tribos.wakandaacademy.credencial.application.repository.CredencialRepository;
import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakander.application.service.WakanderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class CredencialSpringDataMongoDBService implements CredencialService {
	private CredencialRepository credencialRepository;
	private WakanderService wakanderService;

	@Override
	public Credencial criaCredencial(Credencial credencialByForm) {
		log.info("[inicia] CredencialSpringDataJpaService - criaCredencial");
		credencialByForm.encriptaSenha();
		wakanderService.eventoCredencialCriada(credencialByForm);
		saveToRepository(credencialByForm);
		log.info("[finaliza] CredencialSpringDataJpaService - criaCredencial");
		return credencialByForm;
	}

	@Override
	public Credencial buscaCredencialPorId(String id) {
		log.info("[inicia] CredencialSpringDataJpaService - buscaCredencial");
		var credencial = findCredencialById(id);
		log.info("[finaliza] CredencialSpringDataJpaService - buscaCredencial");
		return credencial;
	}

	@Override
	public Credencial buscaCredencialPorUsuario(String usuario) {
		log.info("[inicia] CredencialSpringDataJpaService - buscaCredencial");
		Credencial credencial = findCredencialByUsuario(usuario);
		log.info("[finaliza] CredencialSpringDataJpaService - buscaCredencial");
		return credencial;
	}

	private Credencial saveToRepository(Credencial credencial) {
		try {
			return credencialRepository.saveCredencial(credencial);
		} catch (DataIntegrityViolationException e) {
			throw ApiException.throwApiException(HttpStatus.BAD_REQUEST, "Não foi possivel salvar a credencial", e);
		}
	}

	private Credencial findCredencialById(String id) {
		return credencialRepository.findCredencialById(id).orElseThrow(() -> ApiException
				.throwApiException(HttpStatus.NOT_FOUND, "Não existe nenhuma credencial com o Id passado."));
	}

	private Credencial findCredencialByUsuario(String usuario) {
		return credencialRepository.findCredencialByUsuario(usuario).orElseThrow(() -> ApiException
				.throwApiException(HttpStatus.NOT_FOUND, "Não existe nenhuma credencial com o Usuario passado."));
	}
}