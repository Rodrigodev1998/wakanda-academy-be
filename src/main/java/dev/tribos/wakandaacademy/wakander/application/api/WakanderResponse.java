package dev.tribos.wakandaacademy.wakander.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Value;

@Value
public class WakanderResponse {
	private String nome;
	private String email;
	private String whatsapp;
	private StatusWakander statusWakander;
	private LocalDateTime dataHora;

	public WakanderResponse(Wakander wakander) {
		this.nome = wakander.getNome();
		this.email = wakander.getEmail();
		this.whatsapp = wakander.getWhatsapp();
		this.statusWakander = wakander.getStatusWakander();
		this.dataHora = wakander.getDataHoraCriacao();
	}

	public static List<WakanderResponse> parseListDTO(List<Wakander> wakanderPorEmail) {
		return wakanderPorEmail.stream().map(WakanderResponse::new).collect(Collectors.toList());
	}

}
