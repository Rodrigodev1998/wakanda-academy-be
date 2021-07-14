package dev.tribos.wakandaacademy.wakander.infrastructure;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;

@Repository
public interface WakanderSpringDataMongoDBRepository extends MongoRepository<Wakander,String>{
	Wakander findByEmail(String email);
}
