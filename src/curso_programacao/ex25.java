package curso_programacao;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, fatorial = 1;
		i = sc.nextInt();
		if (i == 0) {
			fatorial = 1;
		} else {
			for (; i > 0; i--) {
				fatorial *= i;
			}
		}
		System.out.println(fatorial);

		sc.close();

	}

}
