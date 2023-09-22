package curso_programacao;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {

		int i = 0;
		Scanner sc = new Scanner(System.in);

		for (int x = sc.nextInt(); i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
