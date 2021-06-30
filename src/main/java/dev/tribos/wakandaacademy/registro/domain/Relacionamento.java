package dev.tribos.wakandaacademy.registro.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Relacionamento {

	private TipoRelacionamento tipo;
	private String descricaoTipoOutro;

}
