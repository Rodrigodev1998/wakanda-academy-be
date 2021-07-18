package dev.tribos.wakandaacademy.credencial.infrastructure;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;

@Repository
public interface CredencialSpringDataMongoDBRepository extends MongoRepository<Credencial,UUID> {

	Optional<Credencial> findByUsuario(String usuario );
}
