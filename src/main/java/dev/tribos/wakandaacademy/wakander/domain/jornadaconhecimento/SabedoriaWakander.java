package dev.tribos.wakandaacademy.wakander.domain.jornadaconhecimento;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SabedoriaWakander {
	private String codigo;
	private String nome;
	private String descricao;
	private String logo;
	private LocalDateTime dataInicio;
	private LocalDateTime dataConclusao;
	private List<LicaoWakander> licoes;
	private StatusJornadaConhecimento status;
}
