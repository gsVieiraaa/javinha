package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the measures of triangle X:");

		double lado_a_X = sc.nextDouble();
		double lado_b_X = sc.nextDouble();
		double lado_c_X = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y:");

		double lado_a_Y = sc.nextDouble();
		double lado_b_Y = sc.nextDouble();
		double lado_c_Y = sc.nextDouble();

		double area_X = Heron(lado_a_X, lado_b_X, lado_c_X);
		double area_Y = Heron(lado_a_Y, lado_b_Y, lado_c_Y);

		char maior = ' ';
				
		if (area_X > area_Y) {
			maior = 'X';
		} else {
			maior = 'Y';
		}

		System.out.printf("Triangle X area: %.4f\n", area_X);
		System.out.printf("Triangle Y area: %.4f\n", area_Y);
		System.out.printf("Larger area: "+ maior);
		sc.close();
	}

	public static double Heron(double x, double y, double z) {

		double p = (x + y + z) / 2;
		double area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
		return area;
	}
}
