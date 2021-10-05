package dev.tribos.wakandaacademy.wakander.domain.jornadaconhecimento;

import java.time.LocalDateTime;
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
public class TriboWakander {
	private String codigo;
	private String nome;
	private String descricao;
	private String logo;
	private LocalDateTime inicio;
	private LocalDateTime conclusao;
	private List<SabedoriaWakander> sabedorias;
	private StatusJornadaConhecimento status;
}
