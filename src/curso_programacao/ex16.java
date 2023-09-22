package curso_programacao;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {

		int x = 0;
		Scanner sc = new Scanner(System.in);

		while (x != 2002) {
			x = sc.nextInt();
			if (x != 2002) {
				System.out.println("Senha Invalida");
			} else {
				System.out.println("Acesso Permitido");
			}
		}
		sc.close();

	}

}
