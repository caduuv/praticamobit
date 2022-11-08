/**
 * 
 */
package br.com.mobitbrasil.ped.buscaArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.mobitbrasil.ped.buscarArquivo.IBuscaArquivoService;
import br.com.mobitbrasil.ped.buscarArquivo.exception.AbrirArquivoException;

@Service
public class BuscaArquivoServiceMock implements IBuscaArquivoService {

	public long contarPalavras(String palavra) {
		try {
			return Files.lines(Paths.get("src/main/resources/palavras-mock.txt"))
					.map(row -> StringUtils.countOccurrencesOf(row, palavra))
					.mapToInt(Integer::intValue)
					.sum();
		} catch (IOException e) {
			throw new AbrirArquivoException();
		}
		
		
	}

}
