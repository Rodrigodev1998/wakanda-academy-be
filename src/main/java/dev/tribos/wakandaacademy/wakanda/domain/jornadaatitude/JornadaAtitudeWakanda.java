package dev.tribos.wakandaacademy.wakanda.domain.jornadaatitude;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Getter
@Builder
@Document(collection = "JornadaAtitudeWakanda")
public class JornadaAtitudeWakanda {

    @MongoId(targetType = FieldType.STRING)
    @Max(value = 60)
    private String codigo;

    @NotEmpty(message = "o nome não pode estar vazio")
    @Max(value = 100)
    private String nome;

    private String descricao;

    private String logo = null;

    private Boolean padrao;

}
