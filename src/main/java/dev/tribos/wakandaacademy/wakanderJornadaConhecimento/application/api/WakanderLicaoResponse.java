package dev.tribos.wakandaacademy.wakanderJornadaConhecimento.application.api;

import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.StatusWakanderConhecimento;
import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.TipoAula;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WakanderLicaoResponse {
	private String lessonCode;
	private String lessonName;
	private StatusWakanderConhecimento status;
	private String link;
	private TipoAula tipo;
}
