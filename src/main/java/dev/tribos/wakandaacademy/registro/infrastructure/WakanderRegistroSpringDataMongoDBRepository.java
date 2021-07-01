package dev.tribos.wakandaacademy.registro.infrastructure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import dev.tribos.wakandaacademy.registro.domain.Wakander;


@Repository
	public interface WakanderRegistroSpringDataMongoDBRepository extends MongoRepository<Wakander,String>{
}
