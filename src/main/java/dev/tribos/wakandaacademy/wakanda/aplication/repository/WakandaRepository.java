package dev.tribos.wakandaacademy.wakanda.aplication.repository;

import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;

import java.util.Optional;

public interface WakandaRepository {
	Optional<Wakanda> findWakandaPadrao(String codigo);

	void salva(Wakanda wakanda);
}
