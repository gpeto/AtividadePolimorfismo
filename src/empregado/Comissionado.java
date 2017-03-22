package empregado;

import comum.Empregado;

public class Comissionado extends Empregado{

	private double salarioBase;
	private double comissão;
	private int quantidade;
	
	public Comissionado(){
		
	}
	
	public Comissionado(String nome, String endereço, double salarioBase, double comissão, int quantidade){
		super(nome,endereço);
		this.salarioBase = salarioBase;
		this.comissão = comissão;
		this.quantidade = quantidade;
	}

	public double getSalarioBase(){
		return this.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase){
		this.salarioBase = salarioBase;
	}
	
	public double getComissão(){
		return this.comissão;
	}
	
	public void setComissão(double comissão){
		this.comissão = comissão;
	}
	
	public int getQuantidade(){
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	@Override
	public double calcularSalário() {
		return this.salarioBase + (this.comissão*this.quantidade);
	}
}
