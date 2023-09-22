package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x == 0 && y > 0) {
			System.out.println("Eixo Y\n");
		} else if (x > 0 && y == 0) {
			System.out.println("Eixo X\n");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1\n");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2\n");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3\n");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4\n");
		} else {
			System.out.println("Origem\n");
		}
		sc.close();
	}

}