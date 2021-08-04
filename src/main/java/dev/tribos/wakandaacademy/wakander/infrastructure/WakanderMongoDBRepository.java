package dev.tribos.wakandaacademy.wakander.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import dev.tribos.wakandaacademy.wakander.application.repository.WakanderRepository;
import dev.tribos.wakandaacademy.wakander.domain.StatusWakander;
import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class WakanderMongoDBRepository implements WakanderRepository {
	private WakanderSpringDataMongoDBRepository wakanderSpringDataMongoDBRepository;

	@Override
	public Wakander save(Wakander wakander) {
		log.info("[Inicia] WakanderMongoDBRepository - save");
		Wakander wakanderSalvo = wakanderSpringDataMongoDBRepository.save(wakander);
		log.info("[Finaliza] WakanderMongoDBRepository - save");
		return wakanderSalvo;
	}

	@Override
	public List<Wakander> buscaWakanderPorEmailEhPorStatusAutorizado(String email) {
		log.info("[Inicia] WakanderMongoDBRepository - findByEmail");
		List<Wakander> wakanderSalvo = wakanderSpringDataMongoDBRepository.findByEmailContainingIgnoreCase(email);
		log.info("[Finaliza] WakanderMongoDBRepository - findByEmail");
		return wakanderSalvo;
	}

	@Override
	public Optional<Wakander> findByEmail(String email) {
		log.info("[Inicia] WakanderMongoDBRepository - findByEmail");
		Optional<Wakander> wakanderByEmail = wakanderSpringDataMongoDBRepository.findByEmail(email);
		log.info("[Finaliza] WakanderMongoDBRepository - findByEmail");
		return wakanderByEmail;
	}

	@Override
	public Optional<Wakander> buscaWakanderPorCodigo(String codigoWakander) {
		log.info("[Inicia] WakanderMongoDBRepository - buscaWakanderPorCodigo");
		Optional<Wakander> wakanderByCodigo = wakanderSpringDataMongoDBRepository.findById(codigoWakander);
		log.info("[Finaliza] WakanderMongoDBRepository - buscaWakanderPorCodigo");
		return wakanderByCodigo;
	}

	@Override
	public List<Wakander> buscaWakanderPorStatusNaoAutorizado(StatusWakander naoAutorizado) {
		log.info("[Inicia] WakanderMongoDBRepository - buscaWakanderPorStatusNaoAutorizado");
		List<Wakander> wakanderPorStatusNaoAutorizado = wakanderSpringDataMongoDBRepository
				.findByStatusWakander(naoAutorizado);
		log.info("[Finaliza] WakanderMongoDBRepository - buscaWakanderPorStatusNaoAutorizado");
		return wakanderPorStatusNaoAutorizado;
	}
}