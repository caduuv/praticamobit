package br.com.mobitbrasil.ped.validarTriangulo.entity;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Triangulo")
public class Triangulo {
	
	private Integer a;
	private Integer b;
	private Integer c;
	
	public Triangulo(Integer a, Integer b, Integer c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public Integer getC() {
		return c;
	}
	public void setC(Integer c) {
		this.c = c;
	}
	
	

}
