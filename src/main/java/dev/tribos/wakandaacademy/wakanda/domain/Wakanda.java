package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;

import javax.validation.constraints.Max;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitude;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Document(collection = "Wakanda")
public class Wakanda {

    @MongoId(targetType = FieldType.STRING)
    @Max(value = 60)
    private String codigo;

    JornadaAtitudeWakanda jornadaAtitude;

    public List<EtapaJornadaAtitude> getEtapasJornadaAtitudePadrao() {
    	List<EtapaJornadaAtitudeWakanda> etapasPadrao = this.jornadaAtitude.getEtapasPadrao();
    	return null;
    }
}
