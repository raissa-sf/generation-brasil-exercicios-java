package loopDoWhile;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		
		int numero, somaPositivos = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um número: ");
			numero = scanner.nextInt();
		
			if (numero >= 0) {
				somaPositivos += numero;
			}
			
		} while(numero != 0);
		
		System.out.println("A soma dos números positivos é: " + somaPositivos);
		scanner.close();

	}

}
