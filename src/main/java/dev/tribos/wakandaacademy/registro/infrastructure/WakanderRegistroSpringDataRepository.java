package dev.tribos.wakandaacademy.registro.infrastructure;

import java.util.UUID;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import dev.tribos.wakandaacademy.registro.domain.Registro;


@Repository
//public interface WakanderRegistroSpringDataRepository extends JpaRepository<Registro,UUID>{
	public interface WakanderRegistroSpringDataRepository extends MongoRepository<Registro,UUID>{
}
