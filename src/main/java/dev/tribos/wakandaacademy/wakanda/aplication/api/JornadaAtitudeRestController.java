package dev.tribos.wakandaacademy.wakanda.aplication.api;

import dev.tribos.wakandaacademy.wakanda.aplication.service.WakandaService;
import dev.tribos.wakandaacademy.wakanda.domain.Wakanda;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Log4j2
@RestController
public class JornadaAtitudeRestController implements JornadaAtitudeAPI{

    private WakandaService wakandaService;

    @Override
    public void adicionaEtapaJornadaAtitude(String codigo, JornadaAtitudeForm jornadaAtitudeForm) {
        wakandaService.adicionaEtapaJornadaAtitude(codigo,jornadaAtitudeForm.paraEntidade());
    }

    @Override
    public JornadaAtitudeDTO getJornadaAtitude(String codigo) {
        var wakanda = wakandaService.getWakanda();
        return new JornadaAtitudeDTO();
    }
}
