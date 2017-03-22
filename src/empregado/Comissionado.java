package empregado;

import comum.Empregado;

public class Comissionado extends Empregado{

	private double salarioBase;
	private double comiss�o;
	private int quantidade;
	
	public Comissionado(){
		
	}
	
	public Comissionado(String nome, String endere�o, double salarioBase, double comiss�o, int quantidade){
		super(nome,endere�o);
		this.salarioBase = salarioBase;
		this.comiss�o = comiss�o;
		this.quantidade = quantidade;
	}

	public double getSalarioBase(){
		return this.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase){
		this.salarioBase = salarioBase;
	}
	
	public double getComiss�o(){
		return this.comiss�o;
	}
	
	public void setComiss�o(double comiss�o){
		this.comiss�o = comiss�o;
	}
	
	public int getQuantidade(){
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	@Override
	public double calcularSal�rio() {
		return this.salarioBase + (this.comiss�o*this.quantidade);
	}
}
