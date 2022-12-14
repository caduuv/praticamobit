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
import br.com.mobitbrasil.ped.validarTriangulo.exception.CampoTrianguloFaltanteException;
import br.com.mobitbrasil.ped.validarTriangulo.service.ITrianguloService;
import br.com.mobitbrasil.ped.verificaAnagrama.IAnagramaService;
import br.com.mobitbrasil.ped.verificarPrimeiroPrimo.INumeroPrimoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/v1/pratica")
@Api(tags = "WebService Controller") 
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
	@ApiOperation(value="Validar se o Triangulo ?? V??lido", response = Boolean.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Condi????o de Exist??ncia do Triangulo Devidamente Verificada"),
			@ApiResponse(code = 400, message = "Um Lado do Triangulo Est?? Faltando")
	})
	public ResponseEntity<Boolean> validarFormaTriangulo(@RequestBody Triangulo triangulo){
		
		try {
			return new ResponseEntity<>(trianguloService.checarTriangulo(triangulo.getA(), triangulo.getB(), triangulo.getC()), HttpStatus.OK);
		}catch(NullPointerException e) {
			throw new CampoTrianguloFaltanteException();
		}
		
	}
	
	@GetMapping("/questao2")
	@ApiOperation(value="Validar se uma palavra/texto ?? um pal??ndromo", response = Boolean.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Pal??ndromo Devidamente Verificado")
	})
	public ResponseEntity<Boolean> validarPalindromo(@RequestParam String stringValidar){
		
		return new ResponseEntity<>(palindromoService.checarPalindromo(stringValidar), HttpStatus.OK);
		
	}
	
	@GetMapping("/questao3")
	@ApiOperation(value="Retornar o Primeiro N??mero Primo Ap??s Determinado N??mero", response = Long.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Pr??ximo N??mero Primo Encontrado")
	})
	public ResponseEntity<Long> retornarPrimeiroPrimo(@RequestParam long numero){
		
		return new ResponseEntity<>(numeroPrimoService.proximoPrimo(numero), HttpStatus.OK);
		
	}
	
	@PostMapping("/questao4")
	@ApiOperation(value="Validar se Duas String S??o Anagramas", response = Boolean.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Anagramas Devidamente Verificado")
	})
	public ResponseEntity<Boolean> verificarAnagrama(@RequestBody DoisTextosTO anagrama){
		
		return new ResponseEntity<>(anagramaService.checarAnagramas(anagrama.getTexto1(), anagrama.getTexto2()), HttpStatus.OK);
		
	}
	
	@GetMapping("/questao5")
	@ApiOperation(value="Realiza uma Soma Recursiva de 1 at?? Determinado Valor", response = Long.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Soma Recursiva Realizada")
	})
	public ResponseEntity<Long> somaRecursiva(@RequestParam int valor){
		
		return new ResponseEntity<>(somaRecursivaService.somar(valor), HttpStatus.OK);
		
	}
	
	@GetMapping("/questao7")
	@ApiOperation(value="Buscar String Dentro do 'palavras.txt'", response = Long.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "N??mero de Ocorr??ncias Encontrado")
	})
	public ResponseEntity<Long> buscarArquivo(@RequestParam String palavra){
		
		return new ResponseEntity<>(buscaArquivoService.contarPalavras(palavra), HttpStatus.OK);
		
	}
	
	@PostMapping("/questao8")
	@ApiOperation(value="Ordenar uma Lista de Pessoas por Idade", response = Boolean.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Lista Ordenada")
	})
	public ResponseEntity<List<Pessoa>> ordenarPorIdade(@RequestBody List<Pessoa> pessoas){
		
		return new ResponseEntity<>(pessoaService.ordenar(pessoas), HttpStatus.OK);
		
	}
	
}
