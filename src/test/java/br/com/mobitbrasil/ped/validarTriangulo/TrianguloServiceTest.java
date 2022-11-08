package br.com.mobitbrasil.ped.validarTriangulo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.mobitbrasil.ped.validarTriangulo.entity.Triangulo;
import br.com.mobitbrasil.ped.validarTriangulo.service.ITrianguloService;
import br.com.mobitbrasil.ped.validarTriangulo.service.TrianguloServiceImpl;

public class TrianguloServiceTest {
	
	private static ITrianguloService trianguloService;
	private Triangulo triangulo;
	
	@BeforeAll
	static void beforeAll() {
		trianguloService = new TrianguloServiceImpl();
	}
	
	@Test
	void trianguloAtendeAsCondicoesDeExistencia() {
		
		//Triangulo com falhando por A
		triangulo = new Triangulo(15, 3, 4);
		assertFalse(trianguloService.checarTriangulo(triangulo.getA(), triangulo.getB(), triangulo.getC()));
		
		//Triangulo com falhando por B
		triangulo = new Triangulo(3, 15, 4);
		assertFalse(trianguloService.checarTriangulo(triangulo.getA(), triangulo.getB(), triangulo.getC()));
		
		//Triangulo com falhando por C
		triangulo = new Triangulo(3, 4, 15);
		assertFalse(trianguloService.checarTriangulo(triangulo.getA(), triangulo.getB(), triangulo.getC()));
		
		//Triangulo Válido
		triangulo = new Triangulo(3, 4, 5);
		assertTrue(trianguloService.checarTriangulo(triangulo.getA(), triangulo.getB(), triangulo.getC()));
		
	}

}
