package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;

import javax.validation.constraints.Max;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Builder;
import lombok.Value;
import lombok.extern.log4j.Log4j2;

@Value
@Builder
@Log4j2
@Document(collection = "Wakanda")
public class Wakanda {

    @MongoId(targetType = FieldType.STRING)
    @Max(value = 60)
    private String codigo;

    JornadaAtitudeWakanda jornadaAtitude;

    public List<EtapaJornadaAtitudeWakanda> getEtapasJornadaAtitudePadrao() {
    	log.info("[Inicia] Wakanda - getEtapasJornadaAtitudePadrao");
    	log.info("[Finaliza] Wakanda - getEtapasJornadaAtitudePadrao");
    	return this.jornadaAtitude.getEtapasPadrao();
    }
}
