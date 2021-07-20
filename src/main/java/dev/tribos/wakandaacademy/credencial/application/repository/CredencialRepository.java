package dev.tribos.wakandaacademy.credencial.application.repository;

import java.util.Optional;
import java.util.UUID;


import dev.tribos.wakandaacademy.credencial.domain.Credencial;

public interface CredencialRepository {	
	Credencial saveCredencial (Credencial credencial);
	Optional<Credencial> findCredencialById(String id);
	Optional<Credencial> findCredencialByUsuario(String usuario);

}
