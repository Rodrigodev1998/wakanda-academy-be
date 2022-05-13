package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.StatusWakanderConhecimento;
import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.TipoAula;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WakanderTribeSkillLessonResponse {
	private String lessonCode;
	private String lessonName;
	private StatusWakanderConhecimento status;
	private String link;
	private TipoAula tipo;
}
