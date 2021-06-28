package dev.tribos.wakandaacademy.registro.application.api;

import dev.tribos.wakandaacademy.registro.domain.Registro;
import lombok.Getter;

@Getter

public class WakanderRegistroDTO {

	private String nome;
	private String email;
	private Integer idade;
	private String relacionamento;
	private Boolean filhos;
	private String vidaAcademica;
	private String experienciaemprego;
	private Boolean trabalhoProgramacao;
	private String sobreWakanda;
	private String Participar;

	public WakanderRegistroDTO(Registro registro) {
		this.nome = registro.getNome();
		this.email = registro.getEmail();
		this.idade = registro.getIdade();
		this.relacionamento = registro.getRelacionamento();
		this.filhos = registro.getFilhos();
		this.vidaAcademica = registro.getVidaAcademica();
		this.experienciaemprego = registro.getExperienciaDeEmprego();
		this.trabalhoProgramacao = registro.getTrabalhoComProgramacao();
		this.sobreWakanda = registro.getOqueEntendeuSobreWakanda();
		this.Participar = registro.getPorqueParticiparDoWakanda();

	}

}
