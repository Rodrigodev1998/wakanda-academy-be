package dev.tribos.wakandaacademy.wakander.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;

@Repository
public interface WakanderSpringDataMongoDBRepository extends MongoRepository<Wakander,String> {
	List<Wakander> findByEmailContainingIgnoreCase(String email);

	Optional<Wakander> findByEmail(String email);

	List<Wakander> findByStatusWakander(StatusWakander status);




}
