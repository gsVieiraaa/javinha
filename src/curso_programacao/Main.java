package curso_programacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// %n ou \n é quebra de linha
		
		int x = 9;
		double y = 10.99874;
		System.out.println(x);
		System.out.printf("%.3f%n", y);
		System.out.println("hello world zzz");
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", y);
		System.out.println("Resultado = " + y + " metros");
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e sua renda é de %.2f reais", nome, idade, renda);
		
	}

}
