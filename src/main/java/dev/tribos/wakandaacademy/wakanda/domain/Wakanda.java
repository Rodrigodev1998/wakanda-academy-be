package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;
import javax.validation.constraints.Max;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@Log4j2
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
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

    public void adicionaEtapaJornadaAtitude(EtapaJornadaAtitudeWakanda etapaJornadaAtitude) {
        jornadaAtitude.adicionaEtapaJornadaAtitude(etapaJornadaAtitude);
    }
}
