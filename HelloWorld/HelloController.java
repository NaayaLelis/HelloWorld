package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloWolrd() {
		return "Hello world!";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>BSM's GENERATION<b> <br/> Mentalidade de crescimento <br/> Orientação aos detalhes <br/> Orientação ao futuro <br/> Proatividade <br/> Persistência <br/> Trabalho em equipe <br/> Responsabilidade Pessoal <br/> Comunicação";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Meu objetivo essa semana é enteder as relações entre as APIS para o funcionamento do blog pessoal e projeto final";
	}
	
}
