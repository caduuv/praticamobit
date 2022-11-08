package br.com.mobitbrasil.ped.verificaAnagrama;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class AnagramaServiceImpl implements IAnagramaService{

	
	/**
     * Checar se dois textos são anagramas
     *
     * @param a - Primeiro texto
     * @param b - Segundo texto
     * 
     * Se forem anagramas, tem exatamente as mesmas letras e a mesma quantidade das mesmas
     * logo, se ordenarmos ambas as strings, teremos o mesmo resultado final.
     *
     * @return
     */
	@Override
    public boolean checarAnagramas(String a, String b){
		
		//RegEx para ignorar espaços em branco
        String stringOrdenadaA = ordernarCaracteresEmOrdemAlfabetica(a.replaceAll("\\s+", ""));
        String stringOrdenadaB = ordernarCaracteresEmOrdemAlfabetica(b.replaceAll("\\s+", ""));
        
        return stringOrdenadaB.equalsIgnoreCase(stringOrdenadaA);
        
    }

	private String ordernarCaracteresEmOrdemAlfabetica(String a) {
		
		String str[] = a.split("");
		Arrays.sort(str);
		return Arrays.toString(str);
		
	}

    

}
