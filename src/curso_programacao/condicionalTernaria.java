package curso_programacao;

import java.util.Scanner;

public class condicionalTernaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double preco = sc.nextDouble();
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}

		// SIMPLIFICADO EM TERNARIO

		double preco2 = sc.nextDouble();
		double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;

		System.out.println(desconto);
		System.out.println(desconto2);

		sc.close();
	}
}
