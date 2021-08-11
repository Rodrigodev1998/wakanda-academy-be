package dev.tribos.wakandaacademy.wakander.application.repository;

<<<<<<< HEAD
=======
import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;

>>>>>>> develop
import java.util.List;
import java.util.Optional;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;


public interface WakanderRepository {
	Wakander save(Wakander wakander);
	
	List<Wakander> buscaWakanderPorEmailEhPorStatusAutorizado(String email);
	
	Optional<Wakander> findByEmail(String email);
<<<<<<< HEAD
	Optional<Wakander> buscaWakanderPorCodigo(String codigoWakander);	
=======
	Optional<Wakander> buscaWakanderPorCodigo(String codigoWakander);
	List<Wakander> buscaWakanderPorStatus(StatusWakander statusWakander);
>>>>>>> develop
}
