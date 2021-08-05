package dev.tribos.wakandaacademy.jornadaDaCompetencia;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

public class JornadaDaCompetenciaRestcontroller implements JornadaDaCompetenicaAPI {

	@Override
	public ResponseEntity<JornadaDaCompetenciaDTO> cadastraJornandaDaCompetencia(String codigo,
			@Valid JornadaDaCompetenciaForm jornadaDaCompetenciaForm) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<JornadaDaCompetenciaDTO> listaJornadaCompetencia(String codigoWakander) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
