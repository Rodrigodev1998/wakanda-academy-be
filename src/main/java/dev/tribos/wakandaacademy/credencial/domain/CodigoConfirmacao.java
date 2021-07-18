package dev.tribos.wakandaacademy.credencial.domain;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@Document(collection = "CodigoConfirmacao")
public class CodigoConfirmacao {
	@MongoId()
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	// @Column(nullable = true, name = "cliente_codigo")
	private String codigo;

	// @Column(nullable = true, name = "cliente_momentoCriacaoCodigo")
	private LocalDateTime momentoCriacaoCodigo;

	public CodigoConfirmacao generateCode() {
		return CodigoConfirmacao.builder().codigo(randomCodeGenerator()).momentoCriacaoCodigo(LocalDateTime.now())
				.build();
	}

	private String randomCodeGenerator() {
		Random random = new Random();
		return String.format("%04d", random.nextInt(10000));
	}

}
