package dev.tribos.wakandaacademy.wakander.application.api.wakanderdashboard;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface WakanderDashboardAPI {
	@GetMapping("/v1/wakander/{codigoWakander}/dashboard")
	@ResponseStatus(value = HttpStatus.OK)
	WakanderDashboardResponse buscaDashboardPorCodigo(@PathVariable String codigoWakander);
}