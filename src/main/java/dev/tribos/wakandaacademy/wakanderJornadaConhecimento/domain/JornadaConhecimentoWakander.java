package dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakanda.domain.JornadaConhecimentoWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaConhecimentoWakander {
	private String codigoWakander;
	private List<TriboWakander> tribos;
	
	public void adicionaJornadaConhecimentoWakanda(JornadaConhecimentoWakanda jornadaConhecimentoWakanda) {
		this.tribos.addAll(TriboWakander.convertByWakanda(jornadaConhecimentoWakanda));
	}

	public JornadaConhecimentoWakander(Wakander wakander, Wakanda wakanda) {
		this.codigoWakander = wakander.getCodigo();
		validaWakanda(wakanda);
		wakanda.getJornadasConhecimentoPadroes()
			.forEach(j -> this.adicionaJornadaConhecimentoWakanda(j));
	}

	private void validaWakanda(Wakanda wakanda) {
		Optional.ofNullable(wakanda)
			.orElseThrow(() -> ApiException.throwApiException(HttpStatus.INTERNAL_SERVER_ERROR,
				"Erro ao criar Jornada Conhecimento Wakander!"));
	}
}
