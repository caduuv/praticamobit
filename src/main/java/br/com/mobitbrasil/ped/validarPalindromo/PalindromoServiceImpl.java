package br.com.mobitbrasil.ped.validarPalindromo;

import org.springframework.stereotype.Service;

@Service
public class PalindromoServiceImpl implements IPalindromoService{

	@Override
	public boolean checarPalindromo(String texto) {
		
		//RegEx para ignorar espaços em branco
		String textoSemEspaco = texto.replaceAll("\\s+", "");
		
		return new StringBuilder(textoSemEspaco).reverse().toString().equalsIgnoreCase(textoSemEspaco);
		
	}

    

}
