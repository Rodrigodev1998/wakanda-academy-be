package dev.tribos.wakandaacademy.credencial.application.service;


import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;


@Service
public interface CredencialService {
	Credencial criaCredencial(Credencial buildCredencial);

	Credencial buscaCredencialPorId(String id);

	Credencial buscaCredencialPorUsuario(String usuario);

}
