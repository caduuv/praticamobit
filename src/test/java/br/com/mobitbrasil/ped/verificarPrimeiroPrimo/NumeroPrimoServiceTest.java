package br.com.mobitbrasil.ped.verificarPrimeiroPrimo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumeroPrimoServiceTest {
	
	private static INumeroPrimoService numeroPrimoService;
	
	@BeforeAll
	static void beforeAll() {
		numeroPrimoService = new NumeroPrimoServiceImpl();
	}
	
	@Test
	void proximoPrimo() {
		
		long a = 3;
		long b = 5;
		long c = 7;
		
		assertEquals(a, numeroPrimoService.proximoPrimo(2));
		assertEquals(b, numeroPrimoService.proximoPrimo(a));
		assertEquals(c, numeroPrimoService.proximoPrimo(b));
		assertEquals(11, numeroPrimoService.proximoPrimo(c));
		
	}

}
