package br.com.mobitbrasil.ped.verificaAnagrama;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.mobitbrasil.ped.common.to.DoisTextosTO;

public class AnagramaServiceTest {

	private static IAnagramaService anagramaService;
	private static DoisTextosTO strings;

	@BeforeAll
	static void beforeAll() {
		anagramaService = new AnagramaServiceImpl();
		strings = new DoisTextosTO();
	}
	
	@Test
	void anagramaEstaDevidamenteVerificado() {
		
		//Testagem com anagramas
		strings.setTexto1("banana");
		strings.setTexto2("nabana");
		assertTrue(anagramaService.checarAnagramas(strings.getTexto1(), strings.getTexto2()));
		
		//Testagem com um não-anagramas
		strings.setTexto1("banana");
		strings.setTexto2("babana");
		assertFalse(anagramaService.checarAnagramas(strings.getTexto1(), strings.getTexto2()));
		
	}
	
	@Test
	void shouldAnagramaIgnoraCase() {
		strings.setTexto1("BANANA");
		strings.setTexto2("NABANA");
		assertTrue(anagramaService.checarAnagramas(strings.getTexto1(), strings.getTexto2()));
		
	}
	
	@Test
	void shouldAnagramaIgnoraEspacoEmBranco() {
		strings.setTexto1("BA NAN A");
		strings.setTexto2("NA BANA");
		assertTrue(anagramaService.checarAnagramas(strings.getTexto1(), strings.getTexto2()));
		
	}
	

}
