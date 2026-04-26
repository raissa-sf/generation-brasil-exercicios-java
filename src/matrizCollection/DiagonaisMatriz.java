package matrizCollection;

import java.util.Scanner;

public class DiagonaisMatriz {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		Scanner scanner = new Scanner(System.in);

		// 1. Entrada de Dados
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}

		// 2. Elementos da Diagonal Principal (i == j)
		System.out.println("\nElementos da Diagonal Principal:");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
			somaPrincipal += matriz[i][i];
		}

		// 3. Elementos da Diagonal Secundária
		System.out.println("\n\nElementos da Diagonal Secundária:");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
			somaSecundaria += matriz[i][2 - i];
		}

		// 4. Exibição das Somas
		System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

		scanner.close();
	}
}