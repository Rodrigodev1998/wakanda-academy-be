package dev.tribos.wakandaacademy.jornadaclareza.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Area {
	
	B("BACKEND"),
	F("FRONTEND");
	
	private String label;

}
