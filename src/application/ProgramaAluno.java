package application;

import java.util.Locale;
import java.util.Scanner;

import classes_entidades.Aluno;

public class ProgramaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno.mediaFinal());
		System.out.println(aluno.situacaoNota(aluno.notaFinal));
		
		
		
		
		sc.close();
		

	}

}
