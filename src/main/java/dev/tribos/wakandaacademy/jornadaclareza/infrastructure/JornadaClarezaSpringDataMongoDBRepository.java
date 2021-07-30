package dev.tribos.wakandaacademy.jornadaclareza.infrastructure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;

@Repository
public interface JornadaClarezaSpringDataMongoDBRepository extends MongoRepository<JornadaClareza, String> {

}
