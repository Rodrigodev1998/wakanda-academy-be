package dev.tribos.wakandaacademy.jornadaclareza.application.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import dev.tribos.wakandaacademy.jornadaclareza.application.repository.JornadaClarezaRepository;
import dev.tribos.wakandaacademy.jornadaclareza.domain.Area;
import dev.tribos.wakandaacademy.jornadaclareza.domain.JornadaClareza;


class JornadaClarezaSpringDataMongoDBServiceTest {
	
	private JornadaClarezaSpringDataMongoDBService jornadaClarezaSpringDataMongoDBService;
	
	@Mock
	private JornadaClarezaRepository jornadaClarezaRepository;
	
	private JornadaClareza jornadaClareza;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		this.jornadaClarezaSpringDataMongoDBService = new JornadaClarezaSpringDataMongoDBService(jornadaClarezaRepository);
		this.jornadaClareza = JornadaClareza.builder()
				.seOMundoAcabasse("passaria o dia com a minha filha")
				.umaLista("mudar de vida")
				.seusSonhos("ajudar minha família")
				.areaAtuacao(Area.BACKEND)
				.ganharAte2022("8000,00")
				.ganharAte2025("20.000,00")
				.investirEmVoce("porque quero ser dev")
				.fotografia("me vejo trabalhando em uma grande empresa")
				.propositoInabalavel("minha filha")
				.nivelResponsabilidade("100")
				.nivelComprometimento(10)
				.ondeEstudar("wakanda academy")
				.tempoEstudo("4 horas por dia")
				.feedback("Melhor escola para programadores")
				.build();
				
				
	}

	@Test
	void deveSalvarERetornarUmFormularioValido() {
		Mockito.when(jornadaClarezaRepository.save(jornadaClareza)).thenReturn(jornadaClareza);
		
	    JornadaClareza jornadaClarezaRetornado = jornadaClarezaSpringDataMongoDBService.criaJornadaClareza(jornadaClareza);
	    
	    assertEquals(jornadaClareza, jornadaClarezaRetornado);
	    Mockito.verify(jornadaClarezaRepository).save(jornadaClareza);
	}

}
