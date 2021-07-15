package dev.tribos.wakandaacademy.wakander.application.repository;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import java.util.List;
import java.util.Optional;

public interface WakanderRepository {
	Wakander save(Wakander wakander);
	List<Wakander> findByEmail(String email);
}
