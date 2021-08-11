package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.StatusEtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.Competencia;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaDTO {
	private String codigo;
	private String logo;
	private String nome;
	private StatusEtapaJornadaAtitude status;
	private String descricao;
	private LocalDateTime dataInicio;
	private LocalDateTime dataConclusao;
	private List<Competencia> listaCompetencias;
	private Competencia primeiraCompetenciaSelecionada;
	private Competencia segundaCompetenciaSelecionada;
	private String definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas;
	private String porqueFoImportanteParticiparHj;

	public JornadaDaCompetenciaDTO(Wakander wakander) {
		JornadaDaCompetencia jornadaCompetencia = wakander.getJornadaCompetencia();
		this.codigo = jornadaCompetencia.getCodigo();
		this.logo = jornadaCompetencia.getLogo();
		this.nome = jornadaCompetencia.getNome();
		this.status = jornadaCompetencia.getStatus();
		this.dataInicio = jornadaCompetencia.getDataInicio();
		this.dataConclusao = jornadaCompetencia.getDataConclusao();
		this.listaCompetencias = jornadaCompetencia.getListaCompetencias();
		this.primeiraCompetenciaSelecionada = jornadaCompetencia.getPrimeiraCompetenciaSelecionada();
		this.segundaCompetenciaSelecionada = jornadaCompetencia.getSegundaCompetenciaSelecionada();
		this.definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas = jornadaCompetencia
				.getDefinaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas();
		this.porqueFoImportanteParticiparHj = jornadaCompetencia.getPorqueFoImportanteParticiparHj();

	}
}
