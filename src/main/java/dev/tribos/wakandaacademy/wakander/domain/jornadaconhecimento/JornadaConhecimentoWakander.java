package dev.tribos.wakandaacademy.wakander.domain.jornadaconhecimento;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaConhecimentoWakander {
	private List<TriboWakander> tribos;
}
