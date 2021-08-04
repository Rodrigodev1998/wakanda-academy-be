package dev.tribos.wakandaacademy.credencial.application.repository;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;

import java.util.Optional;

public interface CredencialRepository {	
	Credencial saveCredencial (Credencial credencial);
	Optional<Credencial> findCredencialById(String id);
	Optional<Credencial> findCredencialByUsuario(String usuario);

}
