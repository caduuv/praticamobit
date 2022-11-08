package br.com.mobitbrasil.ped.construcaoClasses;

import java.util.List;

public class Veiculo implements Exibivel { 

	private Motor motor;
	
	private List<Peca> pecas;

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public List<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(List<Peca> pecas) {
		this.pecas = pecas;
	}

	@Override
	public String exibir() {
		return "Veiculo [motor=" + motor.exibir() + ", pecas=" + pecas + "]";
	}
	
	

}
