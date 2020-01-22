package application;

import java.util.Locale;
import java.util.Scanner;

import classes_entidades.ContaBanco;

public class ProgramaBanco {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ContaBanco contaBanco;
		
			System.out.println("Entre com o número da conta: ");
			int numeroConta = sc.nextInt();
			System.out.println("Entre com o nome do Titular: ");
			sc.nextLine();
			String nomeTitular = sc.nextLine();
			System.out.println("Deseja fazer um deposito inicial? s/n");
			char resposta = sc.next().charAt(0);
			
			if(resposta == 's') {
				
				System.out.println("Entre com o valor do Depoisito:");
				double depInicial = sc.nextDouble();
				contaBanco = new ContaBanco(numeroConta, nomeTitular, depInicial);
				
				
			}else {
				contaBanco = new ContaBanco(numeroConta, nomeTitular);
			}
			
			System.out.println();
			System.out.println("Dados da Conta: ");
			System.out.println(contaBanco);
			
			System.out.println("Entre com o valor do deposito: ");
			double depInicial = sc.nextDouble();
			contaBanco.depositar(depInicial);
			
			System.out.println();
			System.out.println("Dados da Conta Atualizado: ");
			System.out.println(contaBanco);
		
		
		
		sc.close();

	}

}
