package dev.tribos.wakandaacademy.registro.domain;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PreCadastroWakander {

	private String vidaAcademica;
	private String experienciaemprego;
	private Boolean trabalhoProgramacao;
	private String sobreWakanda;
	private String participar;

}
