package com.bcanon.apifactorial.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bcanon.apifactorial.persistance.FactorialService;

public class FactorialServiceTest 
{
	@Mock
    private FactorialService factorialService;

    @InjectMocks
    private FactorialServiceImpl factorialServiceImpl;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testBaseCase() {
        int numero = 0;
        int resultadoEsperado = 1;

        int resultadoActual = factorialServiceImpl.calcularFactorial(numero);

        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testFiveCase() {
        int numero = 5;
        int resultadoEsperado = 120;

        int resultadoActual = factorialServiceImpl.calcularFactorial(numero);

        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testSixCase() {
        int numero = 6;
        int resultadoEsperado = 720;

        int resultadoActual = factorialServiceImpl.calcularFactorial(numero);

        assertEquals(resultadoEsperado, resultadoActual);
    }
}
