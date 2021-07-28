package dev.tribos.wakandaacademy.jornadaDaCompetencia.controller.form;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.StatusJornadaDaCompetencia;

public class JornadaDaCompetenciaForm {

	private String nome;
	private StatusJornadaDaCompetencia status;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusJornadaDaCompetencia getStatus() {
		return status;
	}

	public void setStatus(StatusJornadaDaCompetencia status) {
		this.status = status;
	}

	public JornadaDaCompetencia converter() {
		return  jornadaDaCompetencia = JornadaDaCompetencia.builder().nome(nome).statusJornadaDaCompetencia(status);
		//return new JornadaDaCompetencia(nome, status);
	}
	
	;

}
