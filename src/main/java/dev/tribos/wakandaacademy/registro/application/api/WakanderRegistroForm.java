package dev.tribos.wakandaacademy.registro.application.api;

import dev.tribos.wakandaacademy.registro.domain.Registro;
import lombok.Getter;

@Getter
public class WakanderRegistroForm {

	private String nome;
	private String email;
	private Integer idade;
	private String relacionamento;
	private Boolean filhos;
	private String vidaAcademica;
	private String experienciaDeEmprego;
	private Boolean trabalhoComProgramacao;
	private String oqueEntendeuSobreWakanda;
	private String porqueParticiparDoWakanda;

	public Registro toRegistro() {
		return Registro.builder().nome(nome).email(email).idade(idade).relacionamento(relacionamento).filhos(filhos)
				.vidaAcademica(vidaAcademica).experienciaDeEmprego(experienciaDeEmprego)
				.trabalhoComProgramacao(trabalhoComProgramacao).oqueEntendeuSobreWakanda(oqueEntendeuSobreWakanda)
				.porqueParticiparDoWakanda(porqueParticiparDoWakanda).build();
	}
}
