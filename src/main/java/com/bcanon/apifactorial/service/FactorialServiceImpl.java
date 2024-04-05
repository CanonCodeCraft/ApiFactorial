package com.bcanon.apifactorial.service;

import org.springframework.stereotype.Service;

import com.bcanon.apifactorial.persistance.FactorialService;

@Service
public class FactorialServiceImpl implements FactorialService
{
	@Override
	public int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
