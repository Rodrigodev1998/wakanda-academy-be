package dev.tribos.wakandaacademy.wakander.application.api.wakanderdashboard;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Value;

@Value
public class WakanderDashboardResponse {
	private String codigo;
	private String nome;
	private String email;

	public WakanderDashboardResponse(Wakander wakander) {
		this.codigo = wakander.getCodigo();
		this.nome = wakander.getNome();
		this.email = wakander.getEmail();
	}
}
