package br.com.mobitbrasil.ped.buscaArquivo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.mobitbrasil.ped.buscarArquivo.IBuscaArquivoService;

public class BuscaArquivoServiceTest {

	private static IBuscaArquivoService buscaArquivoService;

	@BeforeAll
	static void beforeAll() {
		buscaArquivoService = new BuscaArquivoServiceMock();
	}

	@Test
	void shouldMockHaveExact15Ocurrences() {
		
		assertEquals(15, buscaArquivoService.contarPalavras("mock"));
		
	}

	@Test
	void shouldMobitHaveExact6Ocurrences() {
		
		assertEquals(5, buscaArquivoService.contarPalavras("mobit"));
		
		
	}

}
