package aula2_entidades;

public class Produtos  {

	public String nome;
	public double preco;
	public int quantidade;

	public double valor_total_estoque() {
		return preco * quantidade;
	}

	public void adicionar_produto(int q) {
		this.quantidade += q;
	}

	public void remover_produto(int q) {
		this.quantidade -= q;
	}
	
	public String toString() {
		return  "\nnome: " + nome 
				+ "\npreço: R$" + String.format("%.2f", preco)
				+ "\nquantidade: " + quantidade 
				+ "\npreço total: R$" + String.format("%.2f", valor_total_estoque()); 
		
	}
	
}
