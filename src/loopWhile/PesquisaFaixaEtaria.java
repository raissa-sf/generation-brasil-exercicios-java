package loopWhile;

import java.util.Scanner;

public class PesquisaFaixaEtaria {

	public static void main(String[] args) {
		
		int idade = 0, menorVinteUm = 0, maiorCinquenta = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (idade > -1) {
			
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();
			
			if (idade < 21 && idade > 0) {
				menorVinteUm++;
			} else if (idade > 50) {
				maiorCinquenta ++;
			}
	
		
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menorVinteUm);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorCinquenta);
		
		scanner.close();

	}

}
