package dev.tribos.wakandaacademy.wakander.application.service;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;

import java.util.List;

public interface WakanderService {
	Wakander criaWakander(Wakander wakander);
	List<Wakander> buscaWakanderPorEmail(String email);
	Wakander findByEmail(String email);
	Wakander save(Wakander wakander);
	void eventoCredencialCriada(Credencial credencial);
	Wakander buscaWakanderPorCodigo(String codigoWakander);
	List<Wakander> buscarWakandersPorStatus();
	void preencheEtapaParaWakanderAtravesCodigo(String codigo, EtapaJornadaAtitudeWakander etapa);
}
