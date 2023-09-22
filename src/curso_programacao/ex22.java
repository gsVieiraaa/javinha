package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		int i, count = 0;
		double num, media = 0;
		Scanner sc = new Scanner(System.in);

		for (i = sc.nextInt(); count < i; count++) {
			int x = 0;
			while (x < 3) {
				x++;
				num = sc.nextDouble();
				media += num;
			}
			media /= 3;
			System.out.println(media);
			media = 0;
		}

		sc.close();

	}

}
