package curso_programacao;

public class funcoes_string {

	public static void main(String[] args) {
		
		String original = "abcde  FGHIJ  klMn  PQRs abc";
		
		String minuscula = original.toLowerCase();
		
		String maiuscula = original.toUpperCase();
		
		String remove_espacos_duplicados = original.trim();
		
		String corta_string = original.substring(2);
		
		String corta_string_2 = original.substring(2, 9);
		
		String troca = original.replace('a', 'x');
		
		String troca_2 = original.replace("abc", "xy");
		
		int i = original.indexOf("bc");
		
		int j = original.lastIndexOf("bc");

		System.out.println(original);
		System.out.println(minuscula);
		System.out.println(maiuscula);
		System.out.println(remove_espacos_duplicados);
		System.out.println(corta_string);
		System.out.println(corta_string_2);
		System.out.println(troca);
		System.out.println(troca_2);
		System.out.println(i);
		System.out.println(j);
		
		//OUTRA PARTE DA AULA

		String frutas = "apple lemon orange";
		
		String[] vect = frutas.split(" ");
		String palavra_1 = vect[0];
		String palavra_2 = vect[1];
		String palavra_3 = vect[2];
		
		System.out.println(palavra_1);
		System.out.println(palavra_2);
		System.out.println(palavra_3);
	}

}
