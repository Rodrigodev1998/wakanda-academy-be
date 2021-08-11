package dev.tribos.wakandaacademy.wakander.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;

@Getter
public class WakanderBuscaStatusDTO {

	private String nome;
	private String email;
	private String whatsapp;
	private LocalDateTime dataHora;
	
	public WakanderBuscaStatusDTO(Wakander wakander) {
		this.nome = wakander.getNome();
		this.email=wakander.getEmail();
		this.whatsapp = wakander.getWhatsapp();
		this.dataHora = wakander.getDataHora();
	}

	public static List<WakanderBuscaStatusDTO> parseListBuscaStatusDTO(List<Wakander> wakanderPorStatus) {
		return wakanderPorStatus.stream().map(WakanderBuscaStatusDTO::new).collect(Collectors.toList());
	}
}


