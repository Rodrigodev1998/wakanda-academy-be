package dev.tribos.wakandaacademy.wakander.application.api.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.StatusEtapaJornadaAtitude;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.Competencia;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia.JornadaDaCompetencia;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaForm {
	@NotEmpty
	private String codigo;
	@NotEmpty
	private String logo;
	@NotEmpty @Length(min = 5)
	private String nome;
	@NotEmpty
	private StatusEtapaJornadaAtitude status;
	@NotEmpty
	private String descricao;
	@NotEmpty
	private LocalDateTime dataInicio;
	@NotEmpty
	private LocalDateTime dataConclusao;
	@NotEmpty
	private Competencia primeiraCompetenciaSelecionada;
	@NotEmpty
	private Competencia segundaCompetenciaSelecionada;
	@NotEmpty
	private List<Competencia> listaCompetencias;
	@NotEmpty
	private String  definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas; 
	@NotEmpty
	private String porqueFoImportanteParticiparHj;

	public JornadaDaCompetencia paraEntidade() {

		return JornadaDaCompetencia.builder().nome(nome)
				.primeiraCompetenciaSelecionada(primeiraCompetenciaSelecionada)
				.segundaCompetenciaSelecionada(segundaCompetenciaSelecionada).listaCompetencias(listaCompetencias)
				.definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas(definaAcoesParaDesenvolverEMelhorarAsCompetenciasEscolhidas)
				.porqueFoImportanteParticiparHj(porqueFoImportanteParticiparHj)
				.build();
	}

}
