package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import java.time.LocalDateTime;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;

public interface EtapaJornadaAtitudeWakander {
	String getCodigo();
	void setCodigo(String codigo);
	String getLogo();
	void setLogo(String logo);
	String getNome();
	void setNome(String nome);
	StatusEtapaJornadaAtitude getStatus();
	void setStatus(StatusEtapaJornadaAtitude status);
	String getDescricao();
	void setDescricao(String descricao);
	LocalDateTime getDataConclusao();
	
	void preenche(EtapaJornadaAtitudeWakander etapaJornadaAtitude);
	
	default void iniciaEtapaJornadaAtitude(EtapaJornadaAtitudeWakanda etapaWakanda) {
		this.setCodigo(etapaWakanda.getCodigo());
		this.setLogo(etapaWakanda.getLogo());
		this.setNome(etapaWakanda.getNome());
		this.setStatus(StatusEtapaJornadaAtitude.BLOQUEADA);
		this.setDescricao(etapaWakanda.getDescricao());
	}
}