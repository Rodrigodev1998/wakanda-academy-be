package dev.tribos.wakandaacademy.wakander.domain.jornadaconhecimento;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import dev.tribos.wakandaacademy.handler.ApiException;
import dev.tribos.wakandaacademy.wakanda.domain.JornadaConhecimentoWakanda;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
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
	private List<TriboWakander> tribos;
	
	public void adicionaJornadaConhecimentoWakanda(JornadaConhecimentoWakanda jornadaConhecimentoWakanda) {
		this.tribos.addAll(TriboWakander.convertByWakanda(jornadaConhecimentoWakanda));
	}

	public JornadaConhecimentoWakander(Wakanda wakanda) {
		wakanda = Optional.ofNullable(wakanda)
		.orElseThrow(() -> ApiException.throwApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao criar Jornada atitude!"));
		wakanda.getJornadasConhecimentoPadroes()
			.forEach(j -> this.adicionaJornadaConhecimentoWakanda(j));
	}
}
