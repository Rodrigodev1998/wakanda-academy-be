package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import java.time.LocalDateTime;

public interface EtapaJornadaAtitudeWakander {
	String getCodigo();
	String getLogo();
	String getNome();
	StatusEtapaJornadaAtitude getStatus();
	String getDescricao();
	LocalDateTime getDataConclusao();
	void preenche(EtapaJornadaAtitudeWakander etapaJornadaAtitude);
}