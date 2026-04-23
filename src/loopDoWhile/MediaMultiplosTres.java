package loopDoWhile;

import java.util.Scanner;

public class MediaMultiplosTres {

	public static void main(String[] args) {

		int numero, quantidadeMultiplos = 0, somaNumeros = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				somaNumeros += numero;
				quantidadeMultiplos++; 
			}

		} while (numero != 0);

		float mediaMultiplos = 0;
		
		if (quantidadeMultiplos > 0) {
			mediaMultiplos = (float) somaNumeros / quantidadeMultiplos;
		}

		System.out.println("A média de todos os números múltiplos de 3 é: " + mediaMultiplos);

	}

}
