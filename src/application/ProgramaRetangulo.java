package application;

import java.util.Locale;
import java.util.Scanner;

import classes_entidades.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo();
		Retangulo altura, largura;
		
		System.out.println("Digite os Valores para calcular a area do Retangulo:");
		
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		System.out.println("Area Total:" + retangulo.calcularArea());
		
		System.out.println("Digite os Valores para calcular o perimetro do Retangulo:");
		
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		System.out.println("Area Total:" + retangulo.calcularPerimetro());
		
		System.out.println("Digite os Valores para calcular a Diagonal do Retangulo:");
		
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		System.out.println("Area Total:" + retangulo.calcularDiagonal());
		
		
		
		sc.close();
	}

}
