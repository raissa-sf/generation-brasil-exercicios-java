package lacoCondicionalIf.opcional;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		int numero;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		}else {
			System.out.println("O número " + numero + " é ímpar.");
		}
		
		scanner.close();

	}

}
