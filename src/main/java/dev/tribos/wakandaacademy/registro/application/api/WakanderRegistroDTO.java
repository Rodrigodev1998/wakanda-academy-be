package dev.tribos.wakandaacademy.registro.application.api;

import dev.tribos.wakandaacademy.registro.domain.Wakander;
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
	private String participar;

	public WakanderRegistroDTO(Wakander wakander) {
		this.nome = wakander.getNome();
		this.email = wakander.getEmail();
		this.idade = wakander.getIdade();
		this.relacionamento = wakander.getRelacionamento();
		this.filhos = wakander.getFilhos();
		this.vidaAcademica = wakander.getPreCadastro().getVidaAcademica();
		this.experienciaemprego = wakander.getPreCadastro().getExperienciaemprego();
		this.trabalhoProgramacao = wakander.getPreCadastro().getTrabalhoProgramacao();
		this.sobreWakanda = wakander.getPreCadastro().getSobreWakanda();
		this.participar = wakander.getPreCadastro().getParticipar();

	}

}
