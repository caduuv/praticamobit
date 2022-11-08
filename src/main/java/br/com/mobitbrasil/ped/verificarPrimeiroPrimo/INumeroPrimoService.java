package br.com.mobitbrasil.ped.verificarPrimeiroPrimo;

public interface INumeroPrimoService {
	
	/**
     * Retornar o proximo numero primo após um valor numerico.
     *
     * @param numero - Valor numerico
     *
     * @return
     */
	public long proximoPrimo(long num);

}
