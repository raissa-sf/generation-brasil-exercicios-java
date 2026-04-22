package lacoCondicionalIf;

import java.util.Scanner;

public class ClassificadorNumerico {

	public static void main(String[] args) {
		
		int numero;
		Scanner scanner = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Digite um número: ");
		numero = scanner.nextInt();
		

		// Processamento
		if (numero >= 0 && numero % 2 == 0) {
			System.out.println("O Número "+ numero + " é par e positivo!");
			
		} else if (numero < 0 && numero % 2 != 0) {
			System.out.println("O Número "+ numero + " é impar e negativo!");
			
		} else if (numero < 0 && numero % 2 == 0) {
			System.out.println("O Número "+ numero + " é par e negativo!");
		} else {
			System.out.println("O Número "+ numero + " é impar e positivo!");
		}
		
		scanner.close();
	}
	

}
