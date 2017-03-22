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
			System.out.print("Digite endereço:");
			c[h].setEndereço(new Scanner(System.in).next());
			System.out.print("Digite Salário Base:");
			c[h].setSalarioBase(new Scanner(System.in).nextDouble());
			System.out.print("Digite Comissão:");
			c[h].setComissão(new Scanner(System.in).nextDouble());
			System.out.print("Digite a quantidade de horas trabalhadas:");
			c[h].setQuantidade(new Scanner(System.in).nextInt());
			System.out.print("\n");
		}

		for (int h = 0; h < c.length; h++) {
			System.out.println("Comissionado " + h);
			System.out.println("Nome: " + c[h].getNome() + "\nEndereço: " + c[h].getEndereço() + "\nSalário Base: R$ "
					+ c[h].getSalarioBase() + "\nComissão: R$ " + c[h].getComissão() + "\nHoras Trabalhadas: "
					+ c[h].getQuantidade() + "\nSalário Final: R$ " + c[h].calcularSalário() + "\n");
		}
	}

}
