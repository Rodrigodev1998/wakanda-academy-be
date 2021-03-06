package dev.tribos.wakandaacademy.wakander.application.api.wakanderTribe;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.domain.StatusWakanderTribe;
import dev.tribos.wakandaacademy.wakander.domain.TipoAula;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
@RequiredArgsConstructor
public class WakanderTribeController implements WakanderTribeAPI {
		@Override
		@ResponseStatus(value = HttpStatus.OK)
		public List<WakanderTribeResponse> listaWakanderTribe(String wakanderCode) {
			log.info("[start] WakanderTribeController - listaWakanderTribe");
			return Arrays.asList(buildLogicaTribe(),buildJavaRaizTribe());
		}

		private WakanderTribeResponse buildLogicaTribe() {
			return WakanderTribeResponse.builder()
					.tribeCode("LOGICA")
					.name("LOGICA DE PROGRAMACAO")
					.description("PRIMEIROS PASSOS")
					.iconUrl("https://imagensemoldes.com.br/wp-content/uploads/2020/05/Engrenagem-Colorida-PNG.png")
					.status(StatusWakanderTribe.DOING)
					.build();
		}
		
		private WakanderTribeResponse buildJavaRaizTribe() {
			return WakanderTribeResponse.builder()
					.tribeCode("JAVA-RAIZ")
					.name("JAVA RAIZ")
					.description("PRINCIPIOS JAVA")
					.iconUrl("https://cdn-icons-png.flaticon.com/512/226/226777.png")
					.status(StatusWakanderTribe.DONE)
					.build();
		}
		

		@Override
		@ResponseStatus(value = HttpStatus.OK)
		public WakanderTribeDetailResponse listarDetailWakanderTribe(String wakanderCode, String tribeCode) {
			log.info("[start] WakanderTribeController - listarDetailWakanderTribe");
			if (tribeCode.equals("LOGICA")) {
				return buildLogicaTribeDetail();				
			} else {
				return buildJavaRaizTribeDetail();
			}
		}

		private WakanderTribeDetailResponse buildLogicaTribeDetail() {
			return WakanderTribeDetailResponse.builder()
					.name("LOGICA DE PROGRAMACAO")
					.wakanderTribeSkills(Arrays.asList(buildLogica1Skill()))	
					.build();
		}
		private WakanderTribeDetailResponse buildJavaRaizTribeDetail() {
			return WakanderTribeDetailResponse.builder()
					.name("JAVA RAIZ")
					.wakanderTribeSkills(Arrays.asList(buildJavaRaizSkill()))	
					.build();
		}

		private WakanderTribeSkillResponse buildLogica1Skill() {
			return WakanderTribeSkillResponse.builder()
					.skillCode("PROGRAMACAO-BASIC")
					.skillName("Jogos cl??ssicos parte I - Iniciando no Javascript com Pong")
					.skillStatus(StatusWakanderTribe.DOING)
					.wakanderTribeSkillLessons(Arrays.asList(buildLogica1Lesson()))
					.build();
		}

		private WakanderTribeSkillLessonResponse buildLogica1Lesson() {
			return WakanderTribeSkillLessonResponse.builder()
					.lessonCode("PARTE-I")
					.lessonName("Pong no Scratch")
					.status(StatusWakanderTribe.DONE)
					.link("https://drive.google.com/drive/folders/1C_lkJcIoDOc0G09AH1_8T7qdif2Orju9?usp=sharing")
					.tipo(TipoAula.GDRIVE)
					.build();
		}
		
		
		private WakanderTribeSkillResponse buildJavaRaizSkill() {
			return WakanderTribeSkillResponse.builder()
					.skillCode("JAVA-VARIAVEIS")
					.skillName("Java Variaveis - Universidade XTI")
					.skillStatus(StatusWakanderTribe.DONE)
					.wakanderTribeSkillLessons(Arrays.asList(buildJavaRaizLesson()))
					.build();
		}

		private WakanderTribeSkillLessonResponse buildJavaRaizLesson() {
			return WakanderTribeSkillLessonResponse.builder()
					.lessonCode("INTRODU????O")
					.lessonName("Introdu????o")
					.status(StatusWakanderTribe.DONE)
					.link("https://www.youtube.com/embed/NZDzuve7kho")	
					.tipo(TipoAula.YOUTUBE)
					.build();
		}
}