package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int [][] mat = new int[l][c];
		
		for(int i = 0; i<l; i++) {
			
			for(int j = 0; j<c; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
			
		}
		
				
				int n = sc.nextInt();
				for(int i = 0; i<l; i++) {
					
					for(int j = 0; j<c; j++) {
						
						if(mat[i][j] == n) {
							
							System.out.println("Position: " + i + ", " + j);
						
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
