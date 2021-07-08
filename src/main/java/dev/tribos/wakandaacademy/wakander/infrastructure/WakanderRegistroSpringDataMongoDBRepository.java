package dev.tribos.wakandaacademy.wakander.infrastructure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;


@Repository
	public interface WakanderRegistroSpringDataMongoDBRepository extends MongoRepository<Wakander,String>{
}
