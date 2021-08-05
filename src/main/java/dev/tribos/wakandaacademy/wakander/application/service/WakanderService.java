package dev.tribos.wakandaacademy.wakander.application.service;

import java.util.List;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitude;

public interface  WakanderService {
	Wakander criaWakander(Wakander wakander);
	
	List<Wakander> buscaWakanderPorEmail(String email);
	
	Wakander findByEmail(String email);
	
	Wakander save(Wakander wakander);

	void eventoCredencialCriada(Credencial credencial);

	Wakander buscaWakanderPorCodigo(String codigoWakander);
<<<<<<< HEAD

	JornadaDaCompetencia saveJornadaDaCompetencia(JornadaDaCompetencia jornadaDaCompetencia);

	List<JornadaDaCompetencia> buscaJornadaDaCompetencia(String wakanderCodigo);
=======
	
	void preencheEtapaParaWakanderAtravesCodigo(String codigo, EtapaJornadaAtitude etapa);
>>>>>>> 08769b2e22ce7690add032c6946ba9ab7ff7e02c
}