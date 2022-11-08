package br.com.mobitbrasil.ped.common;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.mobitbrasil.ped.buscarArquivo.exception.AbrirArquivoException;
import br.com.mobitbrasil.ped.common.exception.MessageExceptionHandler;
import br.com.mobitbrasil.ped.validarTriangulo.exception.CampoTrianguloFaltanteException;

@ControllerAdvice(basePackages = "br.com.mobitbrasil.ped")
public class WSControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(CampoTrianguloFaltanteException.class)
	public ResponseEntity<MessageExceptionHandler> campoTrianguloFaltante(CampoTrianguloFaltanteException campoTrianguloFaltante){
		MessageExceptionHandler error = new MessageExceptionHandler(
				new Date(), HttpStatus.BAD_REQUEST.value(), "Está faltando um lado do triangulo");
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ResponseBody
	@ExceptionHandler(AbrirArquivoException.class)
	public ResponseEntity<MessageExceptionHandler> campoTrianguloFaltante(AbrirArquivoException abrirArquivoException){
		MessageExceptionHandler error = new MessageExceptionHandler(
				new Date(), HttpStatus.INTERNAL_SERVER_ERROR.value(), "Falha ao Abrir o Arquivo 'palavras.txt'");
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
