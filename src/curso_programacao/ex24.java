package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, count = 0;
		double num, div, result;

		for (i = sc.nextInt(); count < i; count++) {
			num = sc.nextInt();
			div = sc.nextInt();
			if (div == 0) {
				System.out.println("divisao impossivel");
			} else {
				result = num / div;
				System.out.printf("%.1f\n", result);
			}
		}
		sc.close();
	}

}
