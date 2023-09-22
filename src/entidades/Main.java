package entidades;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
	
		System.out.println("Digite as medidas do triangulo X: ");
		x.lado_a = sc.nextDouble();
		x.lado_b = sc.nextDouble();
		x.lado_c = sc.nextDouble();
		System.out.println("Digite as medidas do triangulo Y: ");
		y.lado_a = sc.nextDouble();
		y.lado_b = sc.nextDouble();
		y.lado_c = sc.nextDouble();
		
		double area_X = x.area();
		double area_Y = y.area();
		
		System.out.printf("Area do triangulo X: %.4f\n", area_X);
		System.out.printf("Area do triangulo Y: %.4f\n", area_Y);
		
		if (area_X > area_Y) {
			System.out.printf("Maior area: X");
		} else {
			System.out.printf("Maior area: Y");
		}

		
		sc.close();
		
	}
}
