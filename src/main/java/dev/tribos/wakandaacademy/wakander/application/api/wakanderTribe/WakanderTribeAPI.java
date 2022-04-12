package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/wakander")
public interface WakanderTribeAPI {
		@GetMapping("/{wakanderCode}/tribe/")
		@ResponseStatus(code = HttpStatus.OK)
		List<WakanderTribeResponse> listaWakanderTribe(@PathVariable String wakanderCode);	
}
