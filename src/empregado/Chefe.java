package empregado;

import comum.Empregado;

public class Chefe extends Empregado {

	private double salarioMensal;
	
	public Chefe(String nome, String endereço, double salarioMensal){
		super(nome, endereço);
		this.salarioMensal=salarioMensal;
	}

	public double salarioMensal(){
		return this.salarioMensal;
	}
	
	public void salarioMensal(double salarioMensal){
	this.salarioMensal = salarioMensal;	
	}
	
	@Override
	public double calcularSalário() {
		return this.salarioMensal;
	}
}
