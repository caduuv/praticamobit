package br.com.mobitbrasil.ped.verificarPrimeiroPrimo;

import org.springframework.stereotype.Service;

@Service
public class NumeroPrimoServiceImpl implements INumeroPrimoService {

	@Override
	public long proximoPrimo(long num) {

		boolean primoFoiEncontrado = false;
		num++;

		while (!primoFoiEncontrado) {

			if (isPrimo(num)) {
				primoFoiEncontrado = true;
			} else {
				num++;
			}

		}

		return num;

	}

	private boolean isPrimo(long num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if ((num % i) == 0)
				return false;
		}

		return true;
	}

}
