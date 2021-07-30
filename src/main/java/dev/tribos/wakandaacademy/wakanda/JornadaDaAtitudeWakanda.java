package dev.tribos.wakandaacademy.wakanda;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Getter
@Builder
public class JornadaDaAtitudeWakanda {

    @MongoId(targetType = FieldType.OBJECT_ID)
    @Max(value = 60)
    private String codigo;

    @NotEmpty(message = "o nome não pode estar vazio")
    @Max(value = 100)
    private String nome;


    private String descricao;
    
//  private logo

}
