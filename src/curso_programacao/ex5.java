package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, hours;
		float moneyperhour, paycheck;

		num1 = sc.nextInt();
		hours = sc.nextInt();
		moneyperhour = sc.nextFloat();

		paycheck = hours * moneyperhour;

		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", num1, paycheck);

		sc.close();

	}

}
