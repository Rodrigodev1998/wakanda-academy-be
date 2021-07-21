package dev.tribos.wakandaacademy.wakander.application.api;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.List;

@RestController
public interface WakanderAPI {
	
	@PostMapping("/public/v1/wakander/pre-cadastro")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<WakanderPreCadastroDTO> preCadastraWakander(@RequestBody @Valid WakanderPreCadastroForm wakanderPreCadastroForm,
			UriComponentsBuilder uriBuilder);
	
	@GetMapping("/public/v1/wakander")
	@ResponseStatus(value = HttpStatus.OK)
	List<WakanderDTO> buscaPorEmail(@RequestParam (required = false) @Pattern(regexp = "^.+@gmail.com$", message = "o email deve ser um gmail")String gmail);

}
