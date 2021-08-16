package dev.tribos.wakandaacademy.wakanda.aplication.api;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import lombok.Getter;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Getter
public class JornadaAtitudeForm {

    @NotEmpty(message = "o codigo não pode estar vazio")
    @Max(value = 100)
    private String codigo;
    @NotEmpty(message = "o nome não pode estar vazio")
    @Max(value = 100)
    private String nome;
    private String descricao;
    private String logo;
    private Boolean padrao;

    public EtapaJornadaAtitudeWakanda paraEntidade() {
        return EtapaJornadaAtitudeWakanda.builder()
                .codigo(codigo)
                .nome(nome)
                .descricao(descricao)
                .logo(logo)
                .padrao(padrao)
                .build();
    }

}
