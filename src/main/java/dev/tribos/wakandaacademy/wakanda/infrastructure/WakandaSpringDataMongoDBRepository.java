package dev.tribos.wakandaacademy.wakanda.infrastructure;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WakandaSpringDataMongoDBRepository extends MongoRepository<Wakander,String>{
	List<Wakander> findByEmailContainingIgnoreCase(String email);
	
	Optional<Wakander> findByEmail(String email);
}
