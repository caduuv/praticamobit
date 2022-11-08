package br.com.mobitbrasil.ped.validarPalindromo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PalindromoServiceTest {
	
	private static IPalindromoService palindromoService;
	
	@BeforeAll
	static void beforeAll() {
		palindromoService = new PalindromoServiceImpl();
	}
	
	@Test
	void palindromoEstaDevidamenteVerificado() {
		//Testagem com um palíndromo
		assertTrue(palindromoService.checarPalindromo("amor e roma"));
		
		//Testagem com um não-palíndromo
		assertFalse(palindromoService.checarPalindromo("amor e amor"));
		
	}
	
	@Test
	void shouldPalindromoIgnoraCase() {
		assertTrue(palindromoService.checarPalindromo("amor e ROMA"));
		
	}
	
	@Test
	void shouldPalindromoIgnoraEspacoEmBranco() {
		assertTrue(palindromoService.checarPalindromo("amore ROMA"));
		
	}

}
