package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int codigo, qtd;
		double total;

		codigo = sc.nextInt();
		qtd = sc.nextInt();
		if (codigo == 1) {
			total = 4.00 * qtd;
		} else if (codigo == 2) {
			total = 4.50 * qtd;
		} else if (codigo == 3) {
			total = 5.00 * qtd;
		} else if (codigo == 4) {
			total = 2.00 * qtd;
		} else {
			total = 1.50 * qtd;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}

}