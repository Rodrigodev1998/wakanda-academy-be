package dev.tribos.wakandaacademy.jornadaDaCompetencia.api;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.StatusJornadaDaCompetencia;


public class JornadaDaCompetenciaForm {

	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer conhecimentoBackendJava;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer conhecimentoBancodeDados;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer conhecimentoGITHUB;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer compreensãoDevops;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer conhecimentoEmTestes;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer conhecimentoEmAgile;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer conhecimentoEmScrum;
	@NotEmpty
	@Length(min = 3, max = 255)
	private String definicaoDePrimeiraCompetência;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer mediaPrimeiraCompetência;
	@NotEmpty
	private String definicaoDeSegundaCompetencia;
	@NotEmpty
	@Size(min = 0, max = 10)
	private Integer mediaSegundaCompetencia;
	@NotEmpty
	@Length(min = 3, max = 255)
	private String escolhaDeCompetencias;
	@NotEmpty
	@Length(min = 3, max = 255)
	private String acaoParaDesenvolvimentoDeCompetencia;
	@NotEmpty
	@Length(min = 3, max = 255)
	private String porqueValeuAPena;
	@NotEmpty
	private StatusJornadaDaCompetencia statusJornadaDaCompetencia;


	
	public JornadaDaCompetencia converter() {
		return JornadaDaCompetencia.builder()
				.conhecimentoBackendJava(conhecimentoBackendJava)
				.conhecimentoBancodeDados(conhecimentoBancodeDados)
				.conhecimentoGITHUB(conhecimentoGITHUB)
				.compreensãoDevops(compreensãoDevops)
				.conhecimentoEmTestes(conhecimentoEmTestes)
				.conhecimentoEmScrum(conhecimentoEmScrum)
				.definicaoDePrimeiraCompetência(definicaoDePrimeiraCompetência)
				.mediaPrimeiraCompetência(mediaPrimeiraCompetência)
				.definicaoDeSegundaCompetencia(definicaoDeSegundaCompetencia)
				.mediaSegundaCompetencia(mediaSegundaCompetencia)
				.escolhaDeCompetencias(escolhaDeCompetencias)
				.acaoParaDesenvolvimentoDeCompetencia(acaoParaDesenvolvimentoDeCompetencia)
				.porqueValeuAPena(porqueValeuAPena)
				.build();
				
		
	}

	

}
