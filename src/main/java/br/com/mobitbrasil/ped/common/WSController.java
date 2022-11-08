package br.com.mobitbrasil.ped.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mobitbrasil.ped.buscarArquivo.IBuscaArquivoService;
import br.com.mobitbrasil.ped.common.to.DoisTextosTO;
import br.com.mobitbrasil.ped.ordenarIdade.entity.Pessoa;
import br.com.mobitbrasil.ped.ordenarIdade.service.IPessoaService;
import br.com.mobitbrasil.ped.somaRecursiva.ISomaRecursivaService;
import br.com.mobitbrasil.ped.validarPalindromo.IPalindromoService;
import br.com.mobitbrasil.ped.validarTriangulo.entity.Triangulo;
import br.com.mobitbrasil.ped.validarTriangulo.service.ITrianguloService;
import br.com.mobitbrasil.ped.verificaAnagrama.IAnagramaService;
import br.com.mobitbrasil.ped.verificarPrimeiroPrimo.INumeroPrimoService;
import io.swagger.annotations.Api;

@RestController
@Api(tags= {"WebService Controller"} ) 
@RequestMapping("/v1/pratica")
public class WSController {
	
	@Autowired
	private ITrianguloService trianguloService;
	
	@Autowired
	private IPalindromoService palindromoService;
	
	@Autowired
	private INumeroPrimoService numeroPrimoService; 
	
	@Autowired
	private IAnagramaService anagramaService; 
	
	@Autowired
	private ISomaRecursivaService somaRecursivaService;
	
	@Autowired
	private IBuscaArquivoService buscaArquivoService;
	
	@Autowired
	private IPessoaService pessoaService;
	
	@PostMapping("/questao1")
	public ResponseEntity<Boolean> validarFormaTriangulo(@RequestBody Triangulo triangulo){
		
		return new ResponseEntity<>(trianguloService.checarTriangulo(triangulo.getA(), triangulo.getB(), triangulo.getC()), HttpStatus.OK);
		
	}
	
	@GetMapping("/questao2")
	public ResponseEntity<Boolean> validarPalindromo(@RequestParam String stringValidar){
		
		return new ResponseEntity<>(palindromoService.checarPalindromo(stringValidar), HttpStatus.OK);
		
	}
	
	@GetMapping("/questao3")
	public ResponseEntity<Long> retornarPrimeiroPrimo(@RequestParam long numero){
		
		return new ResponseEntity<>(numeroPrimoService.proximoPrimo(numero), HttpStatus.OK);
		
	}
	
	@PostMapping("/questao4")
	public ResponseEntity<Boolean> verificarAnagrama(@RequestBody DoisTextosTO anagrama){
		
		return new ResponseEntity<>(anagramaService.checarAnagramas(anagrama.getTexto1(), anagrama.getTexto2()), HttpStatus.OK);
		
	}
	
	@GetMapping("/questao5")
	public ResponseEntity<Long> somaRecursiva(@RequestParam int valor){
		
		return new ResponseEntity<>(somaRecursivaService.somar(valor), HttpStatus.OK);
		
	}
	
	@GetMapping("/questao7")
	public ResponseEntity<Long> buscarArquivo(@RequestParam String palavra){
		
		return new ResponseEntity<>(buscaArquivoService.contarPalavras(palavra), HttpStatus.OK);
		
	}
	
	@PostMapping("/questao8")
	public ResponseEntity<List<Pessoa>> ordenarPorIdade(@RequestBody List<Pessoa> pessoas){
		
		return new ResponseEntity<>(pessoaService.ordenar(pessoas), HttpStatus.OK);
		
	}
	
}
