package dev.tribos.wakandaacademy.wakanderJornadaConhecimento.application.api;

import java.util.List;

import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.StatusWakanderConhecimento;
import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class WakanderSabedoriaResponse {
	private String skillCode;
	private String skillName;
	private StatusWakanderConhecimento skillStatus;
	private List<WakanderLicaoResponse> wakanderTribeSkillLessons;					
}
