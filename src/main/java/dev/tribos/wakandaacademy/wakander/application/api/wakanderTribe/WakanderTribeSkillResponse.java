package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import java.util.List;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakanderTribe;
import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class WakanderTribeSkillResponse {
	private String skillCode;
	private String skillName;
	private StatusWakanderTribe skillStatus;
	private List<WakanderTribeSkillLessonResponse> wakanderTribeSkillLessons;					
}
