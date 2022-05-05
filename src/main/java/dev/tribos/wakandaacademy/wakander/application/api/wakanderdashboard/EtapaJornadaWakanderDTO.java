package dev.tribos.wakandaacademy.wakander.application.api.wakanderdashboard;

import java.time.LocalDateTime;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.StatusEtapaJornadaAtitude;
import lombok.Value;

@Value
public class EtapaJornadaWakanderDTO {
	private String codigo;
	private String logo;
	private String nome;
	private StatusEtapaJornadaAtitude status;
	private String descricao;
	private LocalDateTime dataConclusao;
	public EtapaJornadaWakanderDTO(EtapaJornadaAtitudeWakander etapa) {
		this.codigo = etapa.getCodigo();
		this.logo = etapa.getLogo();
		this.nome = etapa.getNome();
		this.status = etapa.getStatus();
		this.descricao = etapa.getDescricao();
		this.dataConclusao = etapa.getDataConclusao();
	}
}
