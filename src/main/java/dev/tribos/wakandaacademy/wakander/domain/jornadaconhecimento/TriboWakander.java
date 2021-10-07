package dev.tribos.wakandaacademy.wakander.domain.jornadaconhecimento;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.wakanda.domain.JornadaConhecimentoWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.TriboWakanda;
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

	public static List<TriboWakander> convertByWakanda(JornadaConhecimentoWakanda jornadaConhecimentoWakanda) {
		return jornadaConhecimentoWakanda.getTribos().stream()
			.map(TriboWakander::new)
			.collect(Collectors.toList());
	}
	
	public TriboWakander(TriboWakanda triboWakanda) {
		this.codigo = triboWakanda.getCodigo();
		this.nome = triboWakanda.getNome();
		this.descricao = triboWakanda.getDescricao();
		this.logo = triboWakanda.getLogo();
		this.status = StatusJornadaConhecimento.LIBERADA;
		this.inicio = null;
		this.conclusao = null;
		this.sabedorias = null;
	}
}
