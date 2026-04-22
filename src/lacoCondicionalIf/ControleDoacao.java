package lacoCondicionalIf;

import java.util.Scanner;

public class ControleDoacao {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner scanner = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Digite o Nome do doador: ");
		nome = scanner.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = scanner.nextInt();

		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = scanner.nextBoolean();
		

		// Processamento
		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " pode para doar sangue!");
			
		} else if (idade >= 60 && idade <= 69) {
			
			if(primeiraDoacao) {
				System.out.println(nome + " não pode doar sangue!");
			} else {
				System.out.println(nome + " pode doar sangue!");
			}
			
		} else {
			System.out.println(nome + " não pode doar sangue!");
		}
		
		scanner.close();

	}

}
