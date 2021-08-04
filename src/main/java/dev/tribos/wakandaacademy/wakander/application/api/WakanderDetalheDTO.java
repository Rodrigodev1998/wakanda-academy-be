package dev.tribos.wakandaacademy.wakander.application.api;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class WakanderDetalheDTO {
	private String email;
	private StatusWakander statusWakander;

	public WakanderDetalheDTO(Wakander wakander) {
		this.email = wakander.getEmail();
		this.statusWakander = wakander.getStatusWakander();
	}

	public static List<WakanderDetalheDTO> parseListDTO(List<Wakander> wakanderPorEmail) {
		return wakanderPorEmail.stream().map(WakanderDetalheDTO::new).collect(Collectors.toList());
	}

}
