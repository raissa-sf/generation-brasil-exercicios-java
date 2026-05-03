package lacoCondicionalIf.opcional;

import java.util.Scanner;

public class ComparacaoTresNumeros {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3, maior;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o 1º número: ");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite o 2º número: ");
		numero2 = scanner.nextInt();
		
		System.out.println("Digite o 3º número: ");
		numero3 = scanner.nextInt();
		
		 maior = numero1;

	        if (numero2 > maior) {
	            maior = numero2;
	        } 
	        if (numero3 > maior) {
	            maior = numero3;
	        }

	        System.out.println("O maior número é o: " + maior);
	        
	        scanner.close();
	   
	}

}
