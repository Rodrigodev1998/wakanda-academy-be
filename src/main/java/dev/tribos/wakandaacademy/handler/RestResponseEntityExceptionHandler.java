package dev.tribos.wakandaacademy.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Log4j2
public class RestResponseEntityExceptionHandler {
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<ErrorApiDTO> handleApiException(ApiException ex) {
		log.error("API Exception", ex);
		return ex.toResponseEntity();
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorApiDTO> handleApiException(Exception ex) {
		log.error("Exception", ex);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ErrorApiDTO.builder()
				.description("INTERNAL SERVER ERROR!").message("PLEASE INFORM THE SYSTEM ADMINISTRATOR.").build());
	}

	@ExceptionHandler(BadCredentialsException.class)
	public ResponseEntity<ErrorApiDTO> handleApiException(BadCredentialsException ex) {
		log.error("Security Exception", ex);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ErrorApiDTO.builder().description("Erro de Credenciais")
						.message("O usuário ou senha estão incorretos. Tente novamente.").build());
	}
}