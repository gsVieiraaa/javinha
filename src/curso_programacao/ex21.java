package curso_programacao;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {

		int in = 0, out = 0, i, x, count = 0;
		Scanner sc = new Scanner(System.in);
		for (i = sc.nextInt(); count < i; count++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
