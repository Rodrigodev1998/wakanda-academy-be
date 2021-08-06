package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import java.time.LocalDateTime;

public interface EtapaJornadaAtitude {
	String getCodigo();
	String getLogo();
	String getNome();
	StatusEtapaJornadaAtitude getStatus();
	String getDescricao();
	LocalDateTime dataConclusao();
}