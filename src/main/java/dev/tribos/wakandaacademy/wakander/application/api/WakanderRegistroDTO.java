package dev.tribos.wakandaacademy.wakander.application.api;

import dev.tribos.wakandaacademy.wakander.domain.TipoRelacionamento;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;

@Getter
public class WakanderRegistroDTO {

	private String nome;
	private String email;
	private Integer idade;
	private String whatsapp;
	private TipoRelacionamento relacionamento;
	private Boolean filhos;
	private String vidaAcademica;
	private String experienciaEmprego;
	private Boolean trabalhoProgramacao;
	private String sobreWakanda;
	private String participar;

	public WakanderRegistroDTO(Wakander wakander) {
		this.nome = wakander.getNome();
		this.email = wakander.getEmail();
		this.idade = wakander.getIdade();
		this.whatsapp = wakander.getWhatsapp();
		this.relacionamento = wakander.getRelacionamento();
		this.filhos = wakander.getFilhos();
		this.vidaAcademica = wakander.getPreCadastro().getVidaAcademica();
		this.experienciaEmprego = wakander.getPreCadastro().getExperienciaEmprego();
		this.trabalhoProgramacao = wakander.getPreCadastro().getTrabalhoProgramacao();
		this.sobreWakanda = wakander.getPreCadastro().getSobreWakanda();
		this.participar = wakander.getPreCadastro().getParticipar();
	}

}
