package dev.tribos.wakandaacademy.credencial.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;


@Service
public interface CredencialService {
	Credencial criaCredencial(Credencial buildCredencial);

	Credencial buscaCredencialPorId(UUID id);
	
	void gerarCodigoConfirmacao(String whatsappCliente);

	Credencial buscaCredencialPorUsuario(String usuario);

}
