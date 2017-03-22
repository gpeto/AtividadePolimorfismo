package comum;

public abstract class Empregado {

	private String nome;
	private String endere�o;
	private double valor;
	
	public Empregado(){
		
	}
	
	public Empregado(String nome, String endere�o){
		this.nome = nome;
		this.endere�o = endere�o;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	public abstract double calcularSal�rio();
}
