package dev.tribos.wakandaacademy.wakander.application.service;

import java.util.List;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;

<<<<<<< HEAD
public interface  WakanderService {
=======
import java.util.List;

public interface WakanderService {
>>>>>>> develop
	Wakander criaWakander(Wakander wakander);
	List<Wakander> buscaWakanderPorEmail(String email);
	Wakander findByEmail(String email);
	Wakander save(Wakander wakander);
	void eventoCredencialCriada(Credencial credencial);
	Wakander buscaWakanderPorCodigo(String codigoWakander);
<<<<<<< HEAD

=======
	List<Wakander> buscarWakandersPorStatus();
>>>>>>> develop
	void preencheEtapaParaWakanderAtravesCodigo(String codigo, EtapaJornadaAtitudeWakander etapa);
}
