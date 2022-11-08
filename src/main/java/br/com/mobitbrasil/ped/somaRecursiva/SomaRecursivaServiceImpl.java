package br.com.mobitbrasil.ped.somaRecursiva;

import org.springframework.stereotype.Service;

@Service
public class SomaRecursivaServiceImpl implements ISomaRecursivaService {

	/**
	 * Realizar a soma de forma recursiva de todos valores numericos entre 1 e o
	 * valor informado.
	 *
	 * @param valor
	 *
	 * @return
	 */
	public long somar(int valor) {
		
		if(valor == 0) {
			return 0;
		}
		else {
			return valor + somar(valor - 1);
		}

	}
	
}
