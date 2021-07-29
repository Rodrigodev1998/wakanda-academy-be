package dev.tribos.wakandaacademy.jornadaDaCompetencia.application.api;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.application.domain.StatusJornadaDaCompetencia;


public class JornadaDaCompetenciaForm {

	@NotEmpty(message = "o campo não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer conhecimentoBackendJava;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer conhecimentoBancodeDados;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer conhecimentoGITHUB;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer compreensãoDevops;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer conhecimentoEmTestes;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer conhecimentoEmAgile;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer conhecimentoEmScrum;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Length(min = 3, max = 255)
	private String definicaoDePrimeiraCompetência;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer mediaPrimeiraCompetência;
	@NotEmpty(message = "o nome não pode estar vazio")
	private String definicaoDeSegundaCompetencia;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Size(min = 0, max = 10)
	private Integer mediaSegundaCompetencia;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Length(min = 3, max = 255)
	private String escolhaDeCompetencias;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Length(min = 3, max = 255)
	private String acaoParaDesenvolvimentoDeCompetencia;
	@NotEmpty(message = "o nome não pode estar vazio")
	@Length(min = 3, max = 255)
	private String porqueValeuAPena;
	@NotEmpty(message = "o nome não pode estar vazio")
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
