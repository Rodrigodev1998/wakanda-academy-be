package dev.tribos.wakandaacademy.wakanda.aplication.service;

import java.util.Optional;

import dev.tribos.wakandaacademy.wakanda.aplication.repository.WakandaRepository;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;

public class WakandaTestRepository implements WakandaRepository {
	@Override
	public Optional<Wakanda> findWakandaPadrao(String codigo) {
		return Optional.empty();
	}

	@Override
	public void salva(Wakanda wakanda) {
	}
}
