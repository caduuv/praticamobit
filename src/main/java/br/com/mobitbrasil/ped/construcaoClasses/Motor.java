package br.com.mobitbrasil.ped.construcaoClasses;

public class Motor implements Exibivel {
	
	private Integer potencia;
	
	private Integer cilindrada;

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String exibir() {
		return "Motor [potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}
	
	

}
