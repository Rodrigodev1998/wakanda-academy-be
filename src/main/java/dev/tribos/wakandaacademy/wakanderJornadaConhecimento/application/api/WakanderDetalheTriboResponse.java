package dev.tribos.wakandaacademy.wakanderJornadaConhecimento.application.api;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WakanderDetalheTriboResponse {
	private String detailCode;
	private String name;
	private List<WakanderSabedoriaResponse> wakanderTribeSkills;
	
}
