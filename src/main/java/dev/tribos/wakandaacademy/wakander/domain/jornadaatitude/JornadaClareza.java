package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class JornadaClareza implements EtapaJornadaAtitude {
	private String logo;
	private String nome;
	private StatusEtapaJornadaAtitude status;
	private String descricao;
	
	private String seOMundoAcabasse;
	private String umaLista;
	private String seusSonhos;
	private Area areaAtuacao;
	private String ganharAte2022;
	private String ganharAte2025;
	private String investirEmVoce;
	private String fotografia;
	private String propositoInabalavel;
	private String nivelResponsabilidade;
	private Integer nivelComprometimento;
	private String ondeEstudar;
	private String tempoEstudo;
	private String feedback;
}
