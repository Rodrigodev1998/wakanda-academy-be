package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.jornadaDaCompetencia;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.EtapaJornadaAtitudeWakander;
import dev.tribos.wakandaacademy.wakander.domain.jornadaatitude.StatusEtapaJornadaAtitude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaDaCompetencia implements EtapaJornadaAtitudeWakander {
	@Setter
	private String codigo;
	@Setter
	private String logo;
	@Setter
	private String nome;
	@Setter
	private StatusEtapaJornadaAtitude status;
	@Setter
	private String descricao;
	@NotEmpty 
	private LocalDateTime dataInicio;
	@NotEmpty 
	private LocalDateTime dataConclusao;
	@NotNull
	private Competencia primeiraCompetenciaSelecionada;
	@NotNull
	private Competencia segundaCompetenciaSelecionada;
	@NotNull
	private List<Competencia> listaCompetencias;
	@NotEmpty @Length(min = 5)
	private String  acoesDesenvolverCompetencias; 
	@NotEmpty @Length(min = 5)
	private String importanciaEmParticipar;
	
	@Override
	public void preenche(EtapaJornadaAtitudeWakander etapaJornadaAtitude) {
		JornadaDaCompetencia jornadaDaCompetencia = (JornadaDaCompetencia) etapaJornadaAtitude;
		this.codigo = jornadaDaCompetencia.getCodigo();
		this.logo = jornadaDaCompetencia.getLogo();
		this.nome = jornadaDaCompetencia.getNome();
		this.status = jornadaDaCompetencia.getStatus();
		this.descricao = jornadaDaCompetencia.getDescricao();
		this.dataInicio = jornadaDaCompetencia.getDataInicio();
		this.dataConclusao = jornadaDaCompetencia.getDataConclusao();
		this.primeiraCompetenciaSelecionada = jornadaDaCompetencia.getPrimeiraCompetenciaSelecionada();
		this.segundaCompetenciaSelecionada = jornadaDaCompetencia.getSegundaCompetenciaSelecionada();
		this.listaCompetencias = jornadaDaCompetencia.getListaCompetencias();
		this.acoesDesenvolverCompetencias = jornadaDaCompetencia.getAcoesDesenvolverCompetencias();
		this.importanciaEmParticipar = jornadaDaCompetencia.getImportanciaEmParticipar();
	}

	public JornadaDaCompetencia(EtapaJornadaAtitudeWakanda etapaWakanda) {
		iniciaEtapaJornadaAtitude(etapaWakanda);
	}
}

