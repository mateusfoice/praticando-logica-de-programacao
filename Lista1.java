package exercicios;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		int soma = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matriz[i][j] = ler.nextInt();
				soma += matriz[i][j];
			}
		}
		
		System.out.print(soma);
	
		ler.close();
	}
}
