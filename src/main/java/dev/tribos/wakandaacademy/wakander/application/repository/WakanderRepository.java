package dev.tribos.wakandaacademy.wakander.application.repository;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;

import java.util.List;
import java.util.Optional;


public interface WakanderRepository {
	Wakander save(Wakander wakander);
	List<Wakander> buscaWakanderPorEmailEhPorStatusAutorizado(String email);
	Optional<Wakander> findByEmail(String email);
	Optional<Wakander> buscaWakanderPorCodigo(String codigoWakander);
	List<Wakander> buscaWakanderPorStatus(StatusWakander statusWakander);
}
