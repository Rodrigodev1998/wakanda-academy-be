package dev.tribos.wakandaacademy.credencial.infrastructure;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.credencial.application.api.CredencialRestController;
import dev.tribos.wakandaacademy.credencial.application.repository.CredencialRepository;
import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.wakander.infrastructure.WakanderMongoDBRepository;
import dev.tribos.wakandaacademy.wakander.infrastructure.WakanderSpringDataMongoDBRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class CredencialMongoDBRepository implements CredencialRepository{
	private  CredencialSpringDataMongoDBRepository credencialSpringDataMongoDBRepository;

	@Override
	public Credencial saveCredencial(Credencial buildCredencial) {
		log.info("[inicia] CredencialJPARepository - saveCredencial");
		credencialSpringDataMongoDBRepository.save(buildCredencial);
		log.info("[finaliza] CredencialJPARepository - saveCredencial");
		return buildCredencial;
	}

	@Override
	public Optional<Credencial> findCredencialById(UUID id) {
		log.info("[inicia] CredencialJPARepository - findCredencialById");
		Optional<Credencial> credencialOpt = credencialSpringDataMongoDBRepository.findById(id);
		log.info("[finaliza] CredencialJPARepository - findCredencialById");
		return credencialOpt;
	}
	
	@Override
	public Optional<Credencial> findCredencialByUsuario(String usuario) {
		log.info("[inicia] CredencialJPARepository - findCredencialByUsuario");
		Optional<Credencial> credencial = credencialSpringDataMongoDBRepository.findByUsuario(usuario);
		log.info("[finaliza] CredencialJPARepository - findCredencialByUsuario");
		return credencial;
	}

}
