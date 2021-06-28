package dev.tribos.wakandaacademy.registro.application.repository;

//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;
import dev.tribos.wakandaacademy.registro.domain.Registro;

public interface RegistroRepository {

	Registro save(Registro registro);
}
