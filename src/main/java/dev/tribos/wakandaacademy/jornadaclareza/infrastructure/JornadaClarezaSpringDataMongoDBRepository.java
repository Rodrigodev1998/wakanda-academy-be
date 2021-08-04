package dev.tribos.wakandaacademy.jornadaclareza.infrastructure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.JornadaClareza;

@Repository
public interface JornadaClarezaSpringDataMongoDBRepository extends MongoRepository<JornadaClareza, String> {

}
