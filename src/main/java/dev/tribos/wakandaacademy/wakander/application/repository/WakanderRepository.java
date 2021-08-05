package dev.tribos.wakandaacademy.wakander.application.repository;

import java.util.List;
import java.util.Optional;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaDaCompetencia.JornadaDaCompetencia;


public interface WakanderRepository {
	Wakander save(Wakander wakander);
	List<Wakander> buscaWakanderPorEmailEhPorStatusAutorizado(String email);
	Optional<Wakander> findByEmail(String email);
	Optional<Wakander> buscaWakanderPorCodigo(String codigoWakander);
	
	JornadaDaCompetencia saveJornadaDaCompetencia(JornadaDaCompetencia jornadaDaCompetencia);
	List<JornadaDaCompetencia> buscaJornadaDaCompetencia(String codigoWakander);
	
	
}
