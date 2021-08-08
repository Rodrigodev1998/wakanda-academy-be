package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

public interface EtapaJornadaAtitude {
	String getLogo();
	String getNome();
	StatusEtapaJornadaAtitude getStatus();
	String getDescricao();
	void preenche(EtapaJornadaAtitude etapaJornadaAtitude);
}