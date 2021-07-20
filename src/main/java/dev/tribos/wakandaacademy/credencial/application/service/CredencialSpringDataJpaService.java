package dev.tribos.wakandaacademy.credencial.application.service;

import java.util.UUID;
import dev.tribos.wakandaacademy.handler.ApiException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import lombok.AllArgsConstructor;
import dev.tribos.wakandaacademy.credencial.application.repository.CredencialRepository;
import lombok.extern.log4j.Log4j2;


@Log4j2
@Service
@AllArgsConstructor
public class CredencialSpringDataJpaService implements CredencialService {
	private CredencialRepository credencialRepository;

	@Override
	public Credencial criaCredencial(Credencial credencialByForm) {
		log.info("[inicia] CredencialSpringDataJpaService - criaCredencial");
		credencialByForm.encriptaSenha();
		saveToRepository(credencialByForm);
		log.info("[finaliza] CredencialSpringDataJpaService - criaCredencial");
		return credencialByForm;
	}

	@Override
	public Credencial buscaCredencialPorId(String id) {
		log.info("[inicia] CredencialSpringDataJpaService - buscaCredencial");
		var credencial = findCredencialByCredencialId(id);
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

	private Credencial findCredencialByCredencialId(String id) {
		return credencialRepository.findCredencialById(id).orElseThrow(() -> ApiException
				.throwApiException(HttpStatus.NOT_FOUND, "Não existe nenhuma credencial com o Id passado."));
	}

	private Credencial findCredencialByUsuario(String usuario) {
		return credencialRepository.findCredencialByUsuario(usuario).orElseThrow(() -> ApiException
				.throwApiException(HttpStatus.NOT_FOUND, "Não existe nenhuma credencial com o Usuario passado."));
	}
}
