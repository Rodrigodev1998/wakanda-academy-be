package dev.tribos.wakandaacademy.wakanderJornadaConhecimento.application.api;

import dev.tribos.wakandaacademy.wakanderJornadaConhecimento.domain.StatusWakanderConhecimento;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WakanderTriboResponse {

	private  String codigoTribo;
	private  String nome;
	private  String descricao;
	private  String urlIcone;
	private  StatusWakanderConhecimento status;

}
