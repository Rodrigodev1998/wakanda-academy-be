package dev.tribos.wakandaacademy.wakanda.domain;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TriboWakanda {
	private String codigo;
	private String nome;
	private String descricao;
	private String logo;
	private List<SabedoriaWakanda> sabedorias;
}
