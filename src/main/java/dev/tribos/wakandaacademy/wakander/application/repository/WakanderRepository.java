package dev.tribos.wakandaacademy.wakander.application.repository;


import java.util.List;
import java.util.Optional;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;

public interface WakanderRepository {
	Wakander save(Wakander wakander);
	Optional<Wakander> findByEmail(String email);
	Optional<Wakander> buscaWakanderPorCodigo(String codigoWakander);
	List<Wakander> buscaWakanderPorStatus(StatusWakander statusWakander);
}

