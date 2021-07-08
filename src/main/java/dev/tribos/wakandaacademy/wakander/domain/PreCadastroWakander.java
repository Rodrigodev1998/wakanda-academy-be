package dev.tribos.wakandaacademy.wakander.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PreCadastroWakander {

	private String vidaAcademica;
	private String experienciasEmprego;
	private Boolean jaTrabalhouProgramacao;
	private String entendimentoSobreWakanda;
	private String motivoParaParticiparWakanda;

}
