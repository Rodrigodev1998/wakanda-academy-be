package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakanderTribe;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
@RequiredArgsConstructor
public class WakanderTribeController implements WakanderTribeAPI {
		@Override
		@ResponseStatus(value = HttpStatus.OK)
		public List<WakanderTribeResponse> listaWakanderTribe(String wakanderCode) {
			log.info("[start] WakanderTribeController - listaWakanderTribe");
			var wakanderTribe = WakanderTribeResponse.builder()
					.tribeCode("LOGICA")
					.name("LOGICA DE PROGRAMACAO")
					.description("PRIMEIROS PASSOS")
					.iconUrl("https://cdn-icons-png.flaticon.com/512/152/152760.png")
					.status(StatusWakanderTribe.DONE)
					.build();
			return Arrays.asList(wakanderTribe);
		}
}