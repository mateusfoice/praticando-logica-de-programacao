package exercicios;

import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int[4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("Digite um numero: ");
				matriz[i][j] = ler.nextInt();
			}
		}
		for(int i=0; i<4; i++) {
				System.out.print(matriz[i][i] + "\t");
				System.out.println("");
		}
	
		ler.close();
	}
}
		
	



