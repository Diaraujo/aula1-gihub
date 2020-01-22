package classes_entidades;

public class Retangulo {

	
	public double largura, altura;
	
	
	public double calcularArea() {
		
		return largura * altura;
		
	}
	
	public double calcularPerimetro() {
		
		return (largura + altura) * 2;
		
	}
	
	public double calcularDiagonal() {
		
		return largura * 2 + altura * 2;
		
	}
	
}
