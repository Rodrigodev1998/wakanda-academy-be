package dev.tribos.wakandaacademy.credencial.infrastructure;

import dev.tribos.wakandaacademy.credencial.domain.Credencial;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CredencialSpringDataMongoDBRepository extends MongoRepository<Credencial, String> {

	Optional<Credencial> findByUsuario(String usuario);
}
