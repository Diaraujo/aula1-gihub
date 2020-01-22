package application;

import java.util.Locale;
import java.util.Scanner;

import classes_entidades.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Entre com os dados do funcionario:");
		funcionario.nome = sc.nextLine();
		funcionario.salarioBruto = sc.nextDouble();
		funcionario.imposto = sc.nextDouble();
		System.out.println("Nome:" + funcionario.nome);
		System.out.println("Salario Bruto:"+ " " + funcionario.salarioBruto);
		System.out.println("Imposto: " + funcionario.imposto);
		System.out.println("Funcionario: " + funcionario.nome + ", $" + funcionario.salarioLiquido());
		System.out.println("Deseja aumentar o salario");
		funcionario.porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(funcionario.porcentagem);
		System.out.println("Funcionario: " + funcionario.nome + ", $" + funcionario.salarioBruto);
		
		
		
		sc.close();
	}

}
