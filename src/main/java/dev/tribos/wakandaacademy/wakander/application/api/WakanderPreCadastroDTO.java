package dev.tribos.wakandaacademy.wakander.application.api;

import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.wakander.domain.TipoRelacionamento;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;
import java.util.List;

@Getter
public class WakanderPreCadastroDTO {

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

	public WakanderPreCadastroDTO(Wakander wakander) {
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
	}
	
	public static List<WakanderPreCadastroDTO> parseListDTO(List<Wakander> wakanderPorEmail){
		return wakanderPorEmail.stream().map(WakanderPreCadastroDTO::new).collect(Collectors.toList());
	}
}
