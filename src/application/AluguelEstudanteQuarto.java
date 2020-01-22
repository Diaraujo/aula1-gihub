package application;

import java.util.Locale;
import java.util.Scanner;

import classes_entidades.EstudanteAluguel;

public class AluguelEstudanteQuarto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		EstudanteAluguel estudanteAluguel;
		
		EstudanteAluguel[] vect = new EstudanteAluguel[10];
		
		System.out.println("Quantos quartos quer alugar?");
		int numQuartos = sc.nextInt();
		
		
		for(int i = 1; i <= numQuartos; i++) {
			
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("E-mail: ");
			String email = sc.nextLine();
		
			sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = estudanteAluguel = new EstudanteAluguel(nome, email, quarto);
			
			
		}
		
		System.out.println("Busy rooms :");
		
		for(int i = 0; i < 10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
