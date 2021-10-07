package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.constraints.Max;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.http.HttpStatus;

import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakander.application.service.strategyjornadaatitude.JornadaAtitudeStrategy;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Document(collection = "Wakanda")
public class Wakanda {

    @MongoId(targetType = FieldType.STRING)
    @Max(value = 60)
    private String codigo;

    JornadaAtitudeWakanda jornadaAtitude;
    List<JornadaConhecimentoWakanda> jornadasConhecimento;

    public List<EtapaJornadaAtitudeWakanda> getEtapasJornadaAtitudePadrao() {
    	return this.jornadaAtitude.getEtapasPadrao();
    }
    
    public List<JornadaConhecimentoWakanda> getJornadasConhecimentoPadroes() {
        return this.jornadasConhecimento.stream()
        		.filter(e -> e.getPadrao())
        		.collect(Collectors.toList());
    }
    
	public void setJornadaAtitudeStrategy(JornadaAtitudeStrategy strategyEtapaJornadaAtitude) {
		this.jornadaAtitude.setStrategy(strategyEtapaJornadaAtitude);
	}
	
	public JornadaAtitudeStrategy getJornadaAtitudeStrategy() {
		return Optional.ofNullable(this.jornadaAtitude.getStrategy())
				.orElseThrow(() -> ApiException.throwApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao criar Jornada atitude!"));
	}
}
