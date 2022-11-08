package br.com.mobitbrasil.ped.ordenarIdade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.mobitbrasil.ped.ordenarIdade.entity.Pessoa;
import br.com.mobitbrasil.ped.ordenarIdade.service.IPessoaService;
import br.com.mobitbrasil.ped.ordenarIdade.service.PessoaServiceImpl;

public class PessoaServiceTest {

	private static IPessoaService pessoaService;

	@BeforeAll
	static void beforeAll() {
		pessoaService = new PessoaServiceImpl();
	}
	
	@Test
	void pessoasSaoComparadasPorIdade() {
		
		Pessoa pessoaMaisVelha = new Pessoa("João", 38, "joao@gmail.com", "88888888");
		Pessoa pessoaDoMeio = new Pessoa("Francisco", 25, "francisco@gmail.com", "88888888");
		Pessoa pessoaMaisNova = new Pessoa("Marcelo", 13, "marcelo@gmail.com", "88888888");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoaMaisVelha);
		pessoas.add(pessoaDoMeio);
		pessoas.add(pessoaMaisNova);
		
		List<Pessoa> pessoasOrdenadas = pessoaService.ordenar(pessoas);
		
		assertEquals(0, pessoasOrdenadas.indexOf(pessoaMaisNova));
		assertEquals(1, pessoasOrdenadas.indexOf(pessoaDoMeio));
		assertEquals(2, pessoasOrdenadas.indexOf(pessoaMaisVelha));
		
		
	}

}
