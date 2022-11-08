package br.com.mobitbrasil.ped.construcaoClasses;

public class Caminhao extends Veiculo {

	private Integer toneladas;
	private Double alturaMax;
	private Double comprimento;
	
	public Caminhao() {
		super();
		this.toneladas = 1000;
		this.alturaMax = 5.0;
		this.comprimento = 20.0 ;
	}
	
	public Caminhao(Integer toneladas, Double alturaMax, Double comprimento) {
		super();
		this.toneladas = toneladas;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}
	
	public Integer getToneladas() {
		return toneladas;
	}
	public void setToneladas(Integer toneladas) {
		this.toneladas = toneladas;
	}
	public Double getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(Double alturaMax) {
		this.alturaMax = alturaMax;
	}
	public Double getComprimento() {
		return comprimento;
	}
	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	
	
	
}
