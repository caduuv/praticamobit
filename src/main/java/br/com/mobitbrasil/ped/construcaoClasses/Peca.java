package br.com.mobitbrasil.ped.construcaoClasses;

public class Peca implements Exibivel {

	private String descricao;
	private String marca;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String exibir() {
		return "Peça [descricao=" + descricao + ", marca=" + marca + "]";
	}
	
	

}
