package br.com.mobitbrasil.ped.validarTriangulo.service;

import org.springframework.stereotype.Service;

@Service
public class TrianguloServiceImpl implements ITrianguloService {

	/**
	 * Validar triangulo
	 *
	 * @param a - Lado a
	 * @param b - Lado b
	 * @param c - Lado c
	 *
	 * @return
	 */
	@Override
	public boolean checarTriangulo(int a, int b, int c) {

		if (Integer.valueOf(a) == null || Integer.valueOf(b) == null || Integer.valueOf(c) == null) {
			throw new UnsupportedOperationException();
		}

		// Verificamos se cada um dos lados do triangulo satisfaz a condição
		return satisfazCondicoes(a, b, c) && satisfazCondicoes(b, a, c) && satisfazCondicoes(c, a, b);
	}

	private boolean satisfazCondicoes(int a, int b, int c) {
		return isMenorQueASoma(a, b, c) && isMaiorQueOAbsolutoDaDiferenca(a, b, c);
	}

	private boolean isMenorQueASoma(int a, int b, int c) {
		if (a < b + c) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isMaiorQueOAbsolutoDaDiferenca(int a, int b, int c) {
		if (a > Math.abs(b - c)) {
			return true;
		} else {
			return false;
		}
	}
}
