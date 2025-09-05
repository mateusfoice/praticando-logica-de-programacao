package praticandoJava;

import java.util.Scanner;

public class MatrizCompatível {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int j = 0;
		
		do {
		System.out.print("Define o tamanho da linha do primeiro vetor: ");
		i = sc.nextInt();
		
		System.out.print("Define o tamanho da coluna do segundo vetor: ");
		j = sc.nextInt();
		
		if(i!=j) {
			System.out.println("ERRO! A linha e a coluna dos vetores em questão, precisam serem iguais.");
		}
		
		} while (i != j);
		
		int[][] primeira = new int[i][2];
		int[][] segunda = new int[2][j];
		int[][] resultado = new int[i][j];
		
		for(int x=0; x<i; x++) {
			for(int y=0; y<2; y++) {
				System.out.print("Preencha o primeiro vetor: ");
				primeira[x][y] = sc.nextInt();
			}
		}
		
		for(int x=0; x<2; x++) {
			for(int y=0; y<j; y++) {
				System.out.print("Preencha o segundo vetor: ");
				segunda[x][y] = sc.nextInt();
			}
		}
		
		for(int x=0; x<i; x++) {
			for(int y=0; y<j; y++) {
				
				resultado[x][y] = segunda[x][y] * primeira[x][y];
			}
		}
		
		for(int x=0; x<i; x++) {
			for(int y=0; y<j; y++) {
				System.out.print(resultado[x][y] + "\t");
			}
			System.out.println(" ");
		}
	
		sc.close();
	}

}