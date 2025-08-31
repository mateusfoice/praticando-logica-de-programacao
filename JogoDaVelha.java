package exercicios;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char[][] matriz = new char[3][3];
		
		System.out.println("Digite X ou O: ");
		
		for(int i=0; i < 3; i++) {
			for(int j=0; j < 3; j++) {
				System.out.print("Digite o valor da casa [" + i +"][" + j + "]: " );
				matriz[i][j] = ler.nextLine().charAt(0);
			}
		}
		char vencedor = '-';
		
		
		//vertical
		if(vencedor != matriz[0][0] && matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0]
				|| matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1]
				|| matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2]) {
			vencedor = matriz[0][0];
			System.out.println("O vencedor é o "+ vencedor);
		}
		//horizontal
		else if(vencedor != matriz[0][0] && matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2]
				|| matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2]
				|| matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2]) {	
			vencedor = matriz[0][0];
			System.out.println("O vencedor é o "+ vencedor);
		}
		
		//diagonal
		else if(vencedor != matriz[0][0] && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]
				|| matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
			vencedor = matriz[0][0];
			System.out.println("O vencedor é o "+ vencedor);
		}
		else {
			System.out.println("Ninguém venceu.");
		}
		
		for(int i=0; i < 3; i++) {
			for(int j=0; j < 3; j++) {
					System.out.print(matriz[i][j]+ "\t");
			}
			System.out.println("");
		}
		
	ler.close();	
	}
}
