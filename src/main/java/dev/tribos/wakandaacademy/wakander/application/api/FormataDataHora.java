package dev.tribos.wakandaacademy.wakander.application.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormataDataHora {
	
	public static String formataDiaHora (LocalDateTime agora) {
		DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		return agora.format(formatadorData) + " " + agora.format(formatadorHoras);
		
	}

}
