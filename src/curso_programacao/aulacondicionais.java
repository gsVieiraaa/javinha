package curso_programacao;

import java.util.Scanner;

public class aulacondicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		}

		// quando é apenas um comando o { é opcional, sendo assim pode utilizar na mesma
		// linha como visto abaixo.

		else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();
	}

}
