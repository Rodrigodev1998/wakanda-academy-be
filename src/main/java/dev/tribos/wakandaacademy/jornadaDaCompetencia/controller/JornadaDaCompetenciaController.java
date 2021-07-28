package dev.tribos.wakandaacademy.jornadaDaCompetencia.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.wakander.domain.Wakander;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/wakander")
public class JornadaDaCompetenciaController {
       @PostMapping 
       public String cadastraJornadaDaCompetencia(@RequestBody @Valid Wakander wakander) {
    	   
    	   return null;
       }
       
       
}
