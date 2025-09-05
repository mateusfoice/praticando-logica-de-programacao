package praticandoJava;

import java.util.Scanner;

public class MatrizQuadrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Difina o tamanho da matriz quadrada: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		int[][] matrizRotacionada = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("Preencha a matriz: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int numero = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				numero = matriz[i][j];
				matrizRotacionada[n-i-1][n-j-1] = numero;
				numero = 0;
			}
		}
		System.out.println("Matriz Rotacionada 90* à direita\n");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(matrizRotacionada[i][j] + "\t");
			}
		System.out.println(" ");
		}
		
		System.out.println("Matriz Original\n");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
		System.out.println(" ");
		}
		
		
		
		
		sc.close();
	}

}
