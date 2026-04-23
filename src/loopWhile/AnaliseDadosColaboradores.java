package loopWhile;

import java.util.Scanner;

public class AnaliseDadosColaboradores {

	public static void main(String[] args) {

		int idade, codigoGenero, codigoCargo, pessoaBackend = 0, mulheresFrontend = 0, homensMobileQuarentaMais = 0,
				nbFullStackTrintaMenos = 0, respostas = 0, media;
		float somaIdade = 0; 

		String continua = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("==========================================");
		System.out.println("     PESQUISA INTERNA COLABORADORES       ");
		System.out.println("==========================================");

		System.out.println("     	IDENTIDADE DE GÊNERO       ");
		System.out.println("------------------------------------------");
		System.out.printf("| %-20s | %-15s |\n", "CÓDIGO DO GÊNERO", "GÊNERO");
		System.out.println("------------------------------------------");
		System.out.printf("| %-20d | %-15s |\n", 1, "Mulher Cis");
		System.out.printf("| %-20d | %-15s |\n", 2, "Homem Cis");
		System.out.printf("| %-20d | %-15s |\n", 3, "Não Binário");
		System.out.printf("| %-20d | %-15s |\n", 4, "Mulher Trans");
		System.out.printf("| %-20d | %-15s |\n", 5, "Homem Trans");
		System.out.printf("| %-20d | %-15s |\n", 6, "Outros");
		System.out.println("------------------------------------------\n");
		System.out.println("     	PESSOA DESENVOLVEDORA       ");
		System.out.println("------------------------------------------");
		System.out.printf("| %-20d | %-15s |\n", 1, "Backend");
		System.out.printf("| %-20d | %-15s |\n", 2, "Frontend");
		System.out.printf("| %-20d | %-15s |\n", 3, "Mobile");
		System.out.printf("| %-20d | %-15s |\n", 4, "FullStack");




		while (!continua.equalsIgnoreCase("N")) {
			System.out.print("\nIdade: ");
			idade = scanner.nextInt();
			somaIdade += idade; 

			System.out.print("Identidade de Gênero: ");
			codigoGenero = scanner.nextInt();

			System.out.print("Pessoa Desenvolvedora: ");
			codigoCargo = scanner.nextInt();

			respostas++;

			if (codigoCargo == 1) {
				pessoaBackend++;
			}

			if ((codigoGenero == 1 || codigoGenero == 4) && codigoCargo == 2) {
				mulheresFrontend++;
			}

			if ((codigoGenero == 2 || codigoGenero == 5) && codigoCargo == 3 && idade > 40) {
				homensMobileQuarentaMais++;
			}

			if (codigoGenero == 3 && codigoCargo == 4 && idade < 30) {
				nbFullStackTrintaMenos++;
			}

			System.out.print("\nDeseja continuar? (S/N): ");
			continua = scanner.next(); 
		}


		float mediaFinal = somaIdade / respostas;

		System.out.println("Total de pessoas desenvolvedoras Backend: " + pessoaBackend );
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend );
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobileQuarentaMais );
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbFullStackTrintaMenos );
		System.out.println("O número total de pessoas que responderam à pesquisa: " + respostas );
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaFinal );


		scanner.close();

	}

}
