package curso_programacao;

import java.util.Scanner;

public class matematica {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		// RAIZ QUADRADA

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.printf("Raiz quadrada de %.1f = " + A + "\n", x);
		System.out.printf("Raiz quadrada de %.1f = %.1f\n", y, B);
		System.out.printf("Raiz quadrada de 25 = %.1f\n", C);

		// POTENCIAÇÃO

		A = Math.pow(x, y);
		B = Math.pow(y, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.printf("%.1f elevado a %.1f = %.1f\n", x, y, A);
		System.out.printf("%.1f elevado ao quadrado = %.1f\n", x, B);
		System.out.printf("5 elevado ao quadrado = %.1f\n", C);

		// VALOR ABSOLUTO

		A = Math.abs(y);
		B = Math.abs(z);
		System.out.printf("Valor absoluto de %.1f = %.1f\n", y, A);
		System.out.printf("Valor absoluto de %.1f = %.1f\n", z, B);

		// FUNÇÃO BHASKARA

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		double x1, x2;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(delta);

		// LISTA COMPLETA: java.lang.Math
		sc.close();
	}
}
