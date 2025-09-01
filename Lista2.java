package exercicios;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero para definir o tamanho da matriz: ");
		int tamanho = ler.nextInt();
		
		int[][] matriz = new int[tamanho][tamanho]; 
		
		for(int i=0; i<tamanho; i++) {
			for(int j=0; j<tamanho; j++) {
				System.out.print("Digite numero para preencher a matriz " + tamanho + "x" + tamanho + ": ");
				matriz[i][j] = ler.nextInt();				
			}
		}
		
		for(int i=0; i<tamanho; i++) {
			for(int j=0; j<tamanho; j++) {
				System.out.print(matriz[i][j] + "\t");		
			}
			System.out.println("");
		}

		ler.close();
	}
}
