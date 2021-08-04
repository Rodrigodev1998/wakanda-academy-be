package dev.tribos.wakandaacademy.wakander.application.api;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.TipoRelacionamento;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class WakanderDTO {
	private String nome;
	private String email;
	private Integer idade;
	private String whatsapp;
	private TipoRelacionamento relacionamento;
	private Boolean possuiFilhos;
	private String vidaAcademica;
	private String experienciasEmprego;
	private Boolean jaTrabalhouProgramacao;
	private String entendimentoSobreWakanda;
	private String motivoParaParticiparWakanda;
	private StatusWakander statusWakander;

	public WakanderDTO(Wakander wakander) {
		this.nome = wakander.getNome();
		this.email = wakander.getEmail();
		this.idade = wakander.getIdade();
		this.whatsapp = wakander.getWhatsapp();
		this.relacionamento = wakander.getRelacionamento();
		this.possuiFilhos = wakander.getPossuiFilhos();
		this.vidaAcademica = wakander.getPreCadastro().getVidaAcademica();
		this.experienciasEmprego = wakander.getPreCadastro().getExperienciasEmprego();
		this.jaTrabalhouProgramacao = wakander.getPreCadastro().getJaTrabalhouProgramacao();
		this.entendimentoSobreWakanda = wakander.getPreCadastro().getEntendimentoSobreWakanda();
		this.motivoParaParticiparWakanda = wakander.getPreCadastro().getMotivoParaParticiparWakanda();
		this.statusWakander = wakander.getStatusWakander();
	}

	public static List<WakanderDTO> parseListDTO(List<Wakander> wakanderPorEmail) {
		return wakanderPorEmail.stream().map(WakanderDTO::new).collect(Collectors.toList());
	}

}
