package dev.tribos.wakandaacademy.wakander.application.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;

class WakanderSpringDataMongoDBServiceTest {
	@Test
	void deveriaGerarOCodigoWakanderAtravesDoEmailQuandoExistirEmail() {
		var wakander = Wakander.builder().email("vinicius.reis@gmail.com").build();
		wakander.buildCodigoByEmail();
		assertEquals(wakander.getCodigo(), "viniciusreis");
	}

	@Test
	void deveriaLancarExcecaoQuandoNaoExistirEmail() {
		var wakander = Wakander.builder().build();
		assertThrows(NoSuchElementException.class,
				() -> {
					wakander.buildCodigoByEmail();
				});
	}
}
