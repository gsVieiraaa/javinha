package curso_programacao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, result;

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		result = num1 + num2;
		System.out.println("SOMA = " + result);

		sc.close();
	}

}
