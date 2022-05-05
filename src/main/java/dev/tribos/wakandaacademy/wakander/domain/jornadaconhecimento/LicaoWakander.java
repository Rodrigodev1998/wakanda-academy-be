package dev.tribos.wakandaacademy.wakander.domain.jornadaconhecimento;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LicaoWakander {
	private String codigo;
	private String nome;
	private String descricao;
	private LocalDateTime inicio;
	private LocalDateTime conclusao;
	private StatusJornadaConhecimento status;

	private String conteudo;
	private TipoConteudo tipoConteudo;
	private Integer xp;
}
