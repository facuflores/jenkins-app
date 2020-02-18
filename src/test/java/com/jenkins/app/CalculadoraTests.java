package com.jenkins.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jenkins.app.util.Calculadora;

@SpringBootTest
public class CalculadoraTests {

	@Test
	@DisplayName("Suma de números")
	public void suma_test() {
		int numero1 = 5, numero2 = 5;
		assertEquals(Calculadora.suma(numero1, numero2), 10, "Ha fallada la suma de números");
	}
	
	@Test
	@DisplayName("Resta de números")
	public void resta_test() {
		int numero1 = 5, numero2 = 5;
		assertEquals(Calculadora.resta(numero1, numero2), 0, "Ha fallada la resta de números");
	}
}
