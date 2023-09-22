package aula2;

import java.util.Locale;
import java.util.Scanner;

import aula2_entidades.Produtos;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produtos produto = new Produtos();
		System.out.println("Digite os dados do produto:");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no estoque:");
		produto.quantidade = sc.nextInt();

		System.out.println("Dados do produto: " + produto);
		
		System.out.println("\nDigite quantos produtos serão adicionados ao estoque: ");
		int q = sc.nextInt();
		produto.adicionar_produto(q);
		
		System.out.println("Dados atuais: \n" + produto);
		
		System.out.println("\nDigite quantos produtos serão removidos do estoque: ");
		q = sc.nextInt();
		produto.remover_produto(q);
		
		System.out.println("Dados atuais: \n" + produto);
		
		sc.close();
	}

}
