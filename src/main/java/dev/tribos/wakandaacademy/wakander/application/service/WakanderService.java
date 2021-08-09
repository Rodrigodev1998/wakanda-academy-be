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

<<<<<<< HEAD
	List<Wakander> buscarWakandersPorStatus();

	void preencheEtapaParaWakanderAtravesCodigo(String codigo, EtapaJornadaAtitude etapa);
}
=======
//	void iniciaJornadaDaAtitude(WakandaRepository wakandaRepository, WakandaService wakandaService);
	
	void preencheEtapaParaWakanderAtravesCodigo(String codigo, EtapaJornadaAtitudeWakander etapa);
}
>>>>>>> 49deb07016d0e3ab72f8970c7e4d4d92777549d9
