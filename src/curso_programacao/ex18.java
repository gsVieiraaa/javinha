package curso_programacao;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0, alcool = 0, gasolina = 0, diesel = 0;
		while (x != 4) {
			x = sc.nextInt();
			if (x == 1) {
				alcool += 1;
			} else if (x == 2) {
				gasolina += 1;
			} else if (x == 3) {
				diesel += 1;
			}

		}
		System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel : %d\n", alcool, gasolina, diesel);

		sc.close();
	}

}
