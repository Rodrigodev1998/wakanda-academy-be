package dev.tribos.wakandaacademy.jornadaDaCompetencia.api;

import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.JornadaDaCompetencia;
import dev.tribos.wakandaacademy.jornadaDaCompetencia.domain.StatusJornadaDaCompetencia;
import lombok.Getter;

@Getter
public class JornadaDaCompetenciaDto {
				
	
		private Integer conhecimentoBackendJava;
		
		private Integer conhecimentoBancodeDados;
		
		private Integer conhecimentoGITHUB;
		
		private Integer compreensãoDevops;
		
		private Integer conhecimentoEmTestes;
		
		private Integer conhecimentoEmAgile;
		
		private Integer conhecimentoEmScrum;
		
		private String definicaoDePrimeiraCompetência;
		
		private Integer mediaPrimeiraCompetência;
	
		private String definicaoDeSegundaCompetencia;
		
		private Integer mediaSegundaCompetencia;
		
		private String escolhaDeCompetencias;
		
		private String acaoParaDesenvolvimentoDeCompetencia; 
		
		private String porqueValeuAPena;
		
		private StatusJornadaDaCompetencia statusJornadaDaCompetencia;

	
	public JornadaDaCompetenciaDto (JornadaDaCompetencia jornadaDaCompetencia) {
		this.conhecimentoBackendJava = jornadaDaCompetencia.getConhecimentoBackendJava();
		this.conhecimentoBancodeDados = jornadaDaCompetencia.getConhecimentoBancodeDados();
		this.conhecimentoEmAgile = jornadaDaCompetencia.getConhecimentoEmAgile();
		this.conhecimentoEmScrum = jornadaDaCompetencia.getConhecimentoEmScrum();
		this.conhecimentoEmTestes = jornadaDaCompetencia.getConhecimentoEmTestes();
		this.conhecimentoGITHUB = jornadaDaCompetencia.getConhecimentoGITHUB();
		this.compreensãoDevops = jornadaDaCompetencia.getCompreensãoDevops();
		this.definicaoDePrimeiraCompetência = jornadaDaCompetencia.getDefinicaoDePrimeiraCompetência();
		this.mediaPrimeiraCompetência = jornadaDaCompetencia.getMediaPrimeiraCompetência();
		this.definicaoDeSegundaCompetencia = jornadaDaCompetencia.getDefinicaoDeSegundaCompetencia();
		this.mediaSegundaCompetencia = jornadaDaCompetencia.getMediaSegundaCompetencia();
		this.escolhaDeCompetencias = jornadaDaCompetencia.getEscolhaDeCompetencias();
		this.acaoParaDesenvolvimentoDeCompetencia = jornadaDaCompetencia.getAcaoParaDesenvolvimentoDeCompetencia();
		this.porqueValeuAPena = jornadaDaCompetencia.getPorqueValeuAPena();
		this.statusJornadaDaCompetencia= jornadaDaCompetencia.getStatusJornadaDaCompetencia();
	}

	
	public static List<JornadaDaCompetenciaDto> converter(List<JornadaDaCompetencia> jornadas) {
		
		return jornadas.stream().map(JornadaDaCompetenciaDto::new).collect(Collectors.toList());
	}

	
	

}
