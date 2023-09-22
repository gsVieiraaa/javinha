package curso_programacao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4, diferenca;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		diferenca = (num1 * num2 - num3 * num4);
		System.out.println("DIFERENCA = " + diferenca);
		sc.close();
	}

}
