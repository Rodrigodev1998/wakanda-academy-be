package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaConhecimentoWakanda {
	private String codigo;
	private String nome;
	private List<TriboWakanda> tribos;
    private Boolean padrao;
}