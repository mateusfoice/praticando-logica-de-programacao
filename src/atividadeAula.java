//ATIVIDADE DO ALUNO MATEUS ALVES COSTA, RA: 6925107837, ABSTRAÇÃO DE ESTRUTURA DE DADOS

import java.util.Scanner;

public class atividadeAula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos locais você deseja visitar nessa viagem ?\n");
		int quantidade = sc.nextInt();
		sc.nextLine(); 
		String[] local = new String[quantidade];
		
		int somaLocais = 0;
		for(int i=0; i<quantidade; i++) {
			System.out.printf("Digite o %da local da viagem (ou FIM para encerrar): ", i+1);
			String entrada = sc.nextLine();
			
			if (entrada.equalsIgnoreCase("FIM")) {
				break;
			}
			
			local[i] = entrada;
			somaLocais += 1;
		}

		System.out.print("\nEsses foram os locais visitados por você na viagem:\n");
		for(int i=0; i<somaLocais; i++) {
			System.out.println(local[i]);
		}
		
		System.out.println("\nTotal de locais visitados: " + somaLocais + "\n");
		
		System.out.println("Qual local você deseja confirmar que houve visita ?");
		String escolha = sc.nextLine();
		for(int i=0; i<somaLocais; i++) {
			if(escolha.equals(local[i])) {
				System.out.printf("Vi aqui, você visitou " + local[i] + ".\n");
			}
		}

			System.out.print("\nSó para te lembrar, o último local visitado por você foi: " + local[somaLocais - 1] + ".\n");
		sc.close();
		}
}