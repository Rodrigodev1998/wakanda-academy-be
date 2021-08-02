package dev.tribos.wakandaacademy.wakander.application.api;

import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.wakander.domain.PreCadastroWakander;
import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.TipoRelacionamento;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;

@Getter
public class WakanderBuscaStatusDTO {
		
		private String codigo;
		private String nome;
		private String email;
		private Integer idade;
		private String whatsapp;
		private TipoRelacionamento relacionamento;
		private StatusWakander statusWakander;
		private Boolean possuiFilhos;
		private PreCadastroWakander preCadastro;
		
		private String vidaAcademica;
		private String experienciasEmprego;
		private Boolean jaTrabalhouProgramacao;
		private String entendimentoSobreWakanda;
		private String motivoParaParticiparWakanda;

		

		public WakanderBuscaStatusDTO(Wakander wakander) {
			this.codigo = wakander.getCodigo();
			this.nome = wakander.getNome();
			this.email = wakander.getEmail();
			this.idade = wakander.getIdade();
			this.whatsapp = wakander.getWhatsapp();
			this.relacionamento = wakander.getRelacionamento();
			this.statusWakander = wakander.getStatusWakander();
			this.possuiFilhos = wakander.getPossuiFilhos();
			this.vidaAcademica = wakander.getPreCadastro().getVidaAcademica();
			this.experienciasEmprego =wakander.getPreCadastro().getExperienciasEmprego();
			this.jaTrabalhouProgramacao = wakander.getPreCadastro().getJaTrabalhouProgramacao();
			this.entendimentoSobreWakanda = wakander.getPreCadastro().getEntendimentoSobreWakanda();
			this.motivoParaParticiparWakanda = wakander.getPreCadastro().getMotivoParaParticiparWakanda();
			
		}
		

		public static List<WakanderBuscaStatusDTO> parseListBuscaStatusDTO(List<Wakander> wakanderPorStatus) {
			return wakanderPorStatus.stream().map(WakanderBuscaStatusDTO::new).collect(Collectors.toList());
		}

	}

