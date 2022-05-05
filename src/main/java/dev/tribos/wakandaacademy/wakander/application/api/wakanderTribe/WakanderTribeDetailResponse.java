package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WakanderTribeDetailResponse {
	private String detailCode;
	private String name;
	private List<WakanderTribeSkillResponse> wakanderTribeSkills;
	
}
