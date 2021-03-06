package dev.tribos.wakandaacademy.wakander.application.service;

import java.util.List;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.wakander.application.api.preCadastroWakander.WakanderPreCadastroRequest;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;

public interface WakanderService {
	Wakander criaWakander(WakanderPreCadastroRequest wakanderPreCadastroRequest);
	List<Wakander> buscaWakanderPorEmail(String email);
	Wakander findByEmail(String email);
	Wakander save(Wakander wakander);
	void eventoCredencialCriada(Credencial credencial);
	Wakander buscaWakanderPorCodigo(String codigoWakander);
	List<Wakander> buscarWakandersPorStatus();
	void preencheEtapaParaWakanderAtravesCodigo(String codigo, EtapaJornadaAtitudeWakander etapa);
}