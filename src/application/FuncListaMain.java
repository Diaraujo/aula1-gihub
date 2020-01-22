package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes_entidades.FuncLista;

public class FuncListaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<FuncLista> listFuncionarios = new ArrayList<>();
		
		System.out.println("Quantos Funcionario serão Registrados? ");
		int nFuncionarios = sc.nextInt();
		
		
		for(int i = 1; i <= nFuncionarios; i++) {
			
			System.out.println("Entre com os dados do funcionario:");
			System.out.println();
			System.out.println("Funcionario #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();;
		
			sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			listFuncionarios.add(new FuncLista(id, nome, salario));
			
		}
		System.out.println("Entre com o funcionario que deseja aumentar o salario: ");
		System.out.print("Id: ");
		Integer id = sc.nextInt();
		FuncLista emp = listFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("Funcionario não existe!");
		}
		else {
		System.out.println("Entre com a porcentagem: ");
		Double porcentagem = sc.nextDouble();
		emp.aumentarSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios:");
		for (FuncLista obj : listFuncionarios) {
			System.out.println(obj);
		}
		
		sc.close();

	}

}
