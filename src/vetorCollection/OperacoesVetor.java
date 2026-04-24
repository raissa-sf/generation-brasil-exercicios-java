package vetorCollection;

import java.util.Scanner;

public class OperacoesVetor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[10];
		int soma = 0;
		float media;


		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetor[i] = scanner.nextInt();
		}


		System.out.println("\nElementos nos índices ímpares:");
		for (int i = 1; i < vetor.length; i += 2) {
			System.out.print(vetor[i] + " ");
		}

		System.out.println("\n\nElementos pares:");
		for (int numero : vetor) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
			soma += numero; 
		}


		media = (float) soma / vetor.length;


		System.out.println("\n\nSoma: " + soma);
		System.out.printf("Média: %.2f\n", media);

		scanner.close();
	}
}