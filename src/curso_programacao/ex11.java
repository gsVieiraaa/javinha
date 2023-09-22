package curso_programacao;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao = 24 - inicio + fim;

		if (duracao > 24) {
			duracao -= 24;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}
}