package empregado;

import java.util.Scanner;

public class Mostrar {
	public static void main(String[] args) {
		Comissionado c[] = new Comissionado[2];

		for (int i = 0; i < c.length; i++) {
			c[i] = new Comissionado();
		}

		for (int h = 0; h < c.length; h++) {
			System.out.print("Digite nome:");
			c[h].setNome(new Scanner(System.in).next());
			System.out.print("Digite endere�o:");
			c[h].setEndere�o(new Scanner(System.in).next());
			System.out.print("Digite Sal�rio Base:");
			c[h].setSalarioBase(new Scanner(System.in).nextDouble());
			System.out.print("Digite Comiss�o:");
			c[h].setComiss�o(new Scanner(System.in).nextDouble());
			System.out.print("Digite a quantidade de horas trabalhadas:");
			c[h].setQuantidade(new Scanner(System.in).nextInt());
			System.out.print("\n");
		}

		for (int h = 0; h < c.length; h++) {
			System.out.println("Comissionado " + h);
			System.out.println("Nome: " + c[h].getNome() + "\nEndere�o: " + c[h].getEndere�o() + "\nSal�rio Base: R$ "
					+ c[h].getSalarioBase() + "\nComiss�o: R$ " + c[h].getComiss�o() + "\nHoras Trabalhadas: "
					+ c[h].getQuantidade() + "\nSal�rio Final: R$ " + c[h].calcularSal�rio() + "\n");
		}
	}

}
