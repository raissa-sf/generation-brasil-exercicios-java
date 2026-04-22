package lacoCondicionalIf;

import java.util.Scanner;

public class TaxonomiaAnimal {

	public static void main(String[] args) {

		String filo, classe, dieta;
		Scanner scanner = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite o filo do animal (vertebrado/invertebrado): ");
		filo = scanner.nextLine();

		System.out.println("Digite a classe do animal: ");
		classe = scanner.nextLine();

		System.out.println("Insira a dieta do animal: ");
		dieta = scanner.nextLine();

		// Processamento
		if (filo.equalsIgnoreCase("vertebrado")) {

			if (classe.equalsIgnoreCase("ave")) {
				if (dieta.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pomba");
				}
			} else if (classe.equalsIgnoreCase("mamifero")) {
				if (dieta.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				} else {
					System.out.println("Vaca");
				}
			}

		} else if (filo.equalsIgnoreCase("invertebrado")) {

			if (classe.equalsIgnoreCase("inseto")) {
				if (dieta.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				} else {
					System.out.println("Lagarta");
				}
			} else if (classe.equalsIgnoreCase("anelideo")) {
				if (dieta.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("Minhoca");
				}
			}

		}

		scanner.close(); 
	}
}