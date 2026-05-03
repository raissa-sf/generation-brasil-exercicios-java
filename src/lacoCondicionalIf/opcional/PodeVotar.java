package lacoCondicionalIf.opcional;

import java.util.Scanner;

public class PodeVotar {

	public static void main(String[] args) {
		
		int idade;
		char cidadao;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		
		System.out.println("Você é cidadão? (s/n)");
		cidadao = scanner.next().charAt(0);
		
		if (idade >= 18 && (cidadao == 's' || cidadao == 'S') ) {
			
			System.out.println("Você pode votar!");
			
		}else if (idade >= 18 && (cidadao == 'n' || cidadao == 'N') ){
			
			System.out.println("Lamento, você não pode votar!");
		}else {
			System.out.println("Você não pode votar.");
		}
		
		scanner.close();

	}

}
