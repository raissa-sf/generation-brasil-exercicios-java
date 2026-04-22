package lacoCondicionalIf;

import java.util.Scanner;

public class ComparadorSoma {

	public static void main(String[] args) {
		
		int numeroA, numeroB, numeroC, soma;
		Scanner scanner = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Digite o número A: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o número B: ");
		numeroB = scanner.nextInt();
		
		System.out.println("Digite o número C: ");
		numeroC = scanner.nextInt();
		
		// Processamento
		soma = numeroA + numeroB;
		if (soma > numeroC) {
			System.out.println("A Soma de A + B é Maior do que C");
			
		} else if (soma < numeroC) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		
		else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		scanner.close();


	}

}
