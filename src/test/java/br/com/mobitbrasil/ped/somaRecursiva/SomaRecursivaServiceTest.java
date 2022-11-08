package br.com.mobitbrasil.ped.somaRecursiva;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SomaRecursivaServiceTest {
	
	private static ISomaRecursivaService somaRecursivaService;
	
	@BeforeAll
	static void beforeAll() {
		somaRecursivaService = new SomaRecursivaServiceImpl();
	}
	
	@Test
	void shouldValorNegativoRetornarZero() {
		assertEquals(0, somaRecursivaService.somar(-1));
	}
	
	@Test
	void shouldZeroRetornarZero() {
		assertEquals(0, somaRecursivaService.somar(0));
	}
	
	/**
	 * A soma recursiva utilizando n como base deve sempre ser a soma recursiva de n + 1 somado a n
	 */
	@Test
	void somaAnteriorIgualAtualMaisN() {
		
		int A = 5;
		assertEquals(somaRecursivaService.somar(A), somaRecursivaService.somar(A - 1) + A);
		
	}
	
	@Test
	void shouldDoisValoresRetornaremSomasDiferentes() {
		
		int A = 8;
		int B = 10;
		
		assertNotEquals(
				somaRecursivaService.somar(A), 
				somaRecursivaService.somar(B));
		
	}

}
