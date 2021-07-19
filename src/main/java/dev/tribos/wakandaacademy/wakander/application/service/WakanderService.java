package dev.tribos.wakandaacademy.wakander.application.service;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import java.util.List;

public interface  WakanderService {
	Wakander criaWakander(Wakander wakander);
	
	List<Wakander> buscaWakanderPorEmail(String email);
}
