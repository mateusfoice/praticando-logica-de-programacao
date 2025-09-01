package exercicios;

import java.util.Scanner;

public class Lista4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int[3][2];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print("Digite um numero: ");
				matriz[i][j] = ler.nextInt();
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matriz[j][i] + "\t");
			}
			System.out.println("");
		}

		ler.close();
	}
}
