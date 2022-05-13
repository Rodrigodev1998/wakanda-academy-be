package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.StatusWakanderConhecimento;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WakanderTribeResponse {

	private  String tribeCode;
	private  String name;
	private  String description;
	private  String iconUrl;
	private  StatusWakanderConhecimento status;

}
