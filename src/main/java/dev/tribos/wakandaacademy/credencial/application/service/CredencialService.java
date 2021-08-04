package dev.tribos.wakandaacademy.credencial.application.service;


import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import org.springframework.stereotype.Service;


@Service
public interface CredencialService {
	Credencial criaCredencial(Credencial buildCredencial);

	Credencial buscaCredencialPorId(String id);

	Credencial buscaCredencialPorUsuario(String usuario);

}
