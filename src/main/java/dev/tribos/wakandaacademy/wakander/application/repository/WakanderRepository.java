package dev.tribos.wakandaacademy.wakander.application.repository;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import java.util.List;


public interface WakanderRepository {
	Wakander save(Wakander wakander);
	List<Wakander> findByEmail(String email);
}
