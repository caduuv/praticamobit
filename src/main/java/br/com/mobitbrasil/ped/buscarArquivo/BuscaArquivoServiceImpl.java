/**
 * 
 */
package br.com.mobitbrasil.ped.buscarArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

import br.com.mobitbrasil.ped.buscarArquivo.exception.AbrirArquivoException;

@Service
public class BuscaArquivoServiceImpl implements IBuscaArquivoService {
	
	 /**
     * Verificar a quantidade de ocorrências de uma palavra em um arquivo texto.
     *
     * Arquivo: palavras.txt em src/main/resources/
     *
     * @param palavra - Palavra para pesquisa
     *
     * @return
     */
	@Override
	public long contarPalavras(String palavra) {
		
		try {
			return Files.lines(Paths.get("src/main/resources/palavras.txt")).filter(row -> row.toLowerCase().contains(palavra.toLowerCase())).count();
		} catch (IOException e) {
			throw new AbrirArquivoException();
		}
		
		
	}

}
