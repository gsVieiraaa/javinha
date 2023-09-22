package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		int codigo1, quantidade1, codigo2, quantidade2;
		double preco1, preco2, total;

		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		preco1 = sc.nextDouble();

		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		preco2 = sc.nextDouble();

		total = (quantidade1 * preco1) + (quantidade2 * preco2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();
	}

}
