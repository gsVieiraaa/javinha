package curso_programacao;

import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String x,m;
		x = sc.next();
		System.out.printf("Você digitou - %s%n", x);
		
		int y;
		y = sc.nextInt();
		System.out.printf("Você digitou - %d%n", y);
		
		double w;
		w = sc.nextDouble();
		System.out.printf("Você digitou - %.2f%n", w);
		
		sc.nextLine();
		m = sc.nextLine();
		System.out.printf("Você digitou - %s%n", m);
		
		char z;
		z = sc.next().charAt(0);
		System.out.printf("Você digitou - %c%n", z);
		
		
		sc.close();
	}

}
