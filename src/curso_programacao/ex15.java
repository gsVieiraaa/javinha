package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, imposto;
		salario = sc.nextDouble();

		if (salario <= 2000) {
			System.out.println("Isento");
		} else {
			salario -= 2000;

			if (salario > 1000) {
				imposto = 1000 * 0.08;
				salario -= 1000;

				if (salario > 1500) {
					imposto += 1500 * 0.18;
					salario -= 1500;

					if (salario > 0) {
						imposto += salario * 0.28;
					}
				} else {
					imposto += salario * 0.18;
				}
			} else {
				imposto = salario * 0.08;
			}
			System.out.printf("R$ %.2f\n", imposto);
		}

		sc.close();
	}

}
