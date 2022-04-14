package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakanderTribe;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WakanderTribeSkillLessonResponse {
	private String lessonCode;
	private String lessonName;
	private StatusWakanderTribe status;
	private String link;
}
