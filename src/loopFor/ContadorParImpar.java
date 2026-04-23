package loopFor;

import java.util.Scanner;

public class ContadorParImpar {

	public static void main(String[] args) {

		int numero, totalPares = 0, totalImpares = 0;
		Scanner scanner = new Scanner(System.in);

		for (int contador = 1; contador < 11; contador++) {

			System.out.println("Digite o " + contador + "º número: ");
			numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				totalPares++;
			} else {
				totalImpares++;
			}
		}
		
		System.out.println("\nTotal de números pares: " + totalPares);
		System.out.println("Total de números ímpares: " + totalImpares);

		scanner.close();
	}

}
