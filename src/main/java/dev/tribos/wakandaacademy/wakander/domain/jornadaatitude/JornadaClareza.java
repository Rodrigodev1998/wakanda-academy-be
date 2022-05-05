package dev.tribos.wakandaacademy.wakander.domain.jornadaatitude;

import java.time.LocalDateTime;

import dev.tribos.wakandaacademy.wakanda.domain.EtapaJornadaAtitudeWakanda;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JornadaClareza implements EtapaJornadaAtitudeWakander {
	@Setter
	private String codigo;
	@Setter
	private String logo;
	@Setter
	private String nome;
	@Setter
	private StatusEtapaJornadaAtitude status;
	@Setter
	private String descricao;
	private LocalDateTime dataConclusao;

	private String seOMundoAcabasse;
	private String umaLista;
	private String seusSonhos;
	private Area areaAtuacao;
	private String ganharAte2022;
	private String ganharAte2025;
	private String investirEmVoce;
	private String fotografia;
	private String propositoInabalavel;
	private String nivelResponsabilidade;
	private Integer nivelComprometimento;
	private String ondeEstudar;
	private String tempoEstudo;
	private String feedback;

	@Override
	public void preenche(EtapaJornadaAtitudeWakander etapaJornadaAtitude) {
		JornadaClareza jornadaClareza = (JornadaClareza) etapaJornadaAtitude;
		this.seOMundoAcabasse = jornadaClareza.getSeOMundoAcabasse();
		this.umaLista = jornadaClareza.getUmaLista();
		this.seusSonhos = jornadaClareza.getSeusSonhos();
		this.areaAtuacao = jornadaClareza.getAreaAtuacao();
		this.ganharAte2022 = jornadaClareza.getGanharAte2022();
		this.ganharAte2025 = jornadaClareza.getGanharAte2025();
		this.investirEmVoce = jornadaClareza.getInvestirEmVoce();
		this.fotografia = jornadaClareza.getFotografia();
		this.propositoInabalavel = jornadaClareza.getPropositoInabalavel();
		this.nivelResponsabilidade = jornadaClareza.getNivelResponsabilidade();
		this.nivelComprometimento = jornadaClareza.getNivelComprometimento();
		this.ondeEstudar = jornadaClareza.getOndeEstudar();
		this.tempoEstudo = jornadaClareza.getTempoEstudo();
		this.feedback = jornadaClareza.getFeedback();
	}

	public JornadaClareza(EtapaJornadaAtitudeWakanda etapaWakanda) {
		this.codigo = etapaWakanda.getCodigo();
		this.logo = etapaWakanda.getLogo();
		this.nome = etapaWakanda.getNome();
		this.status = StatusEtapaJornadaAtitude.BLOQUEADA;
		this.descricao = etapaWakanda.getDescricao();
		iniciaEtapaJornadaAtitude(etapaWakanda);
	}
}
