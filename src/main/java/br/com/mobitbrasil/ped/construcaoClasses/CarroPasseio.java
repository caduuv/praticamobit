package br.com.mobitbrasil.ped.construcaoClasses;

public class CarroPasseio extends Veiculo {
	
	private String cor;
	private String modelo;
	
	public CarroPasseio(String cor, String modelo) {
		super();
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public CarroPasseio() {
		super();
		this.cor = "Preta";
		this.modelo = "Onix Plus";
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String exibir() {
		return super.exibir() + " " + "CarroPasseio [cor=" + cor + ", modelo=" + modelo + "]";
	}
	
	

}
