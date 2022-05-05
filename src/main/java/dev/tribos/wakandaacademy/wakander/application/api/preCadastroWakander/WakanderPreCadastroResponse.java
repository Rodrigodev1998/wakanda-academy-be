package dev.tribos.wakandaacademy.wakander.application.api.preCadastroWakander;

import java.time.LocalDateTime;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;

@Getter
public class WakanderPreCadastroResponse {
	private String codigo;
	private String nome;
	private String email;
	private String whatsapp;
	private LocalDateTime dataHora;

	public WakanderPreCadastroResponse(Wakander wakander) {
		this.codigo = wakander.getCodigo();
		this.nome = wakander.getNome();
		this.email = wakander.getEmail();
		this.whatsapp = wakander.getWhatsapp();
		this.dataHora = wakander.getDataHoraCriacao();
	}
}
