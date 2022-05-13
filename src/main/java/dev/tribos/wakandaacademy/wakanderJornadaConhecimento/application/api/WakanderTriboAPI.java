package dev.tribos.wakandaacademy.wakanderJornadaConhecimento.application.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2/wakander")
public interface WakanderTriboAPI {
		@GetMapping("/{wakanderCodigo}/tribo/")
		@ResponseStatus(code = HttpStatus.OK)
		List<WakanderTriboResponse> listaWakanderTribe(@PathVariable String wakanderCode);	
		
		@GetMapping("/{wakanderCode}/tribe/{tribeCode}")
		@ResponseStatus(code = HttpStatus.OK)
		WakanderDetalheTriboResponse listarDetailWakanderTribe(@PathVariable String wakanderCode, @PathVariable String tribeCode);
}