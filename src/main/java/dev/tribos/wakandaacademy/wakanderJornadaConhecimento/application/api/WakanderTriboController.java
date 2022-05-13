package dev.tribos.wakandaacademy.wakanderJornadaConhecimento.application.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
@RequiredArgsConstructor
public class WakanderTriboController implements WakanderTriboAPI {
		@Override
		@ResponseStatus(value = HttpStatus.OK)
		public List<WakanderTriboResponse> listaWakanderTribe(String wakanderCode) {
			log.info("[start] WakanderTribeController - listaWakanderTribe");
			return Arrays.asList();
		}

		@Override
		@ResponseStatus(value = HttpStatus.OK)
		public WakanderDetalheTriboResponse listarDetailWakanderTribe(String wakanderCode, String tribeCode) {
			log.info("[start] WakanderTribeController - listarDetailWakanderTribe");
			return null;
		}
}