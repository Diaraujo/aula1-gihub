package application;

import java.util.Locale;
import java.util.Scanner;

import classes_entidades.Produto;

public class ControleDeEstoque {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.println("nome: ");
		produto.nome = sc.nextLine();
		System.out.println("preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("quantidade: ");
		produto.quantidade = sc.nextInt();
		System.out.println("Dados do Produto:" + produto);
		System.out.println("Digite a quantidade de produtos a ser adicionado ao estoque:");
		int quantidade = sc.nextInt();
		produto.adcionarProduto(quantidade);
		System.out.println("Dados Atualizados:" + produto);
		System.out.println("Digite a quantidade de produtos a ser removido do estoque:");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println("Dados Atualizados" + produto);
		
		sc.close();
		
	}

}
