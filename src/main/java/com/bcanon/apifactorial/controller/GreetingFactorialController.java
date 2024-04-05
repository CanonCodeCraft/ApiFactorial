package com.bcanon.apifactorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcanon.apifactorial.persistance.FactorialService;

@RestController
@RequestMapping("/api")
public class GreetingFactorialController 
{

	private final FactorialService factorialService;
	
	private static final String GREETING = "¡Saludos desde Code Crafters!";

    public GreetingFactorialController(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    @GetMapping("/hola")
    public String saludar() {
        return GREETING;
    }

    @GetMapping("/factorial/{numero}")
    public int calcularFactorial(@PathVariable int numero) 
    {
        return factorialService.calcularFactorial(numero);
    }
}
