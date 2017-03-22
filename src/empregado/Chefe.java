package empregado;

import comum.Empregado;

public class Chefe extends Empregado {

	private double salarioMensal;
	
	public Chefe(String nome, String endere�o, double salarioMensal){
		super(nome, endere�o);
		this.salarioMensal=salarioMensal;
	}

	public double salarioMensal(){
		return this.salarioMensal;
	}
	
	public void salarioMensal(double salarioMensal){
	this.salarioMensal = salarioMensal;	
	}
	
	@Override
	public double calcularSal�rio() {
		return this.salarioMensal;
	}
}
