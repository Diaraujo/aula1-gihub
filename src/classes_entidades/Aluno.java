package classes_entidades;

public class Aluno {

	public String nome;
	public double nota1, nota2, nota3, notaFinal;
	
	
	public double mediaFinal() {
		
		notaFinal = nota1 + nota2 + nota3;
		
		
		return notaFinal;
	} 
	
	public boolean situacaoNota(double notaFinal) {
		
		if(notaFinal < 60) {
			
			System.out.println("Nota Final: " + notaFinal + " " + "Aluno: " + nome + " " + "Reprovado");
			
			return false;
		}else {
			 
			System.out.println("Nota Final: " + notaFinal + " " + "Aluno: " + nome + " " + "Aprovado");
		}
		return true;
		
		
		
	}
}
