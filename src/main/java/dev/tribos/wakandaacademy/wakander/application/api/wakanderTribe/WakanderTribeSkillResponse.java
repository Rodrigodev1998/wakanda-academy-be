package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import java.util.List;

import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.StatusWakanderConhecimento;
import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class WakanderTribeSkillResponse {
	private String skillCode;
	private String skillName;
	private StatusWakanderConhecimento skillStatus;
	private List<WakanderTribeSkillLessonResponse> wakanderTribeSkillLessons;					
}
