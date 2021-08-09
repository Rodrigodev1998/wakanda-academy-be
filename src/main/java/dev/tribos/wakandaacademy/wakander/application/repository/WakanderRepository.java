package dev.tribos.wakandaacademy.wakander.application.repository;

<<<<<<< HEAD
=======
import dev.tribos.wakandaacademy.wakander.domain.Wakander;

>>>>>>> develop
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.Query;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;


public interface WakanderRepository {
	Wakander save(Wakander wakander);
	
	List<Wakander> buscaWakanderPorEmailEhPorStatusAutorizado(String email);
	Optional<Wakander> findByEmail(String email);
	Optional<Wakander> buscaWakanderPorCodigo(String codigoWakander);
	
	@Query ("") // criar query que busca a jornadaDaCompetencia pelo codigo do wakander
	Optional<JornadaDaCompetencia> buscaEtapaParaWakanderAtravesCodigo(String codigo,
			EtapaJornadaAtitude etapa);
    	
	
}
