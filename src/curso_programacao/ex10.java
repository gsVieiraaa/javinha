package curso_programacao;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, mult;

		num = sc.nextInt();
		mult = sc.nextInt();

		if (mult % num == 0 || num % mult == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}
		sc.close();
	}

}
