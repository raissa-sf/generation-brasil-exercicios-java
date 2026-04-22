package lacoCondicionalSwitchCase;

import java.util.Scanner;

public class MenuPedido {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		float valorTotal, preco = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("##################################################");
		System.out.println("##              Cardápio Lanchonete             ##");
		System.out.println("##################################################");

		System.out.printf("| %-7s | %-18s | %-15s |\n", "Código", "Produto", "Preço Unitário");
		System.out.println("--------------------------------------------------");
		System.out.printf("| %-7d | %-18s | R$ %-12.2f |\n", 1, "Cachorro Quente", 10.00);
		System.out.printf("| %-7d | %-18s | R$ %-12.2f |\n", 2, "X-Salada", 15.00);
		System.out.printf("| %-7d | %-18s | R$ %-12.2f |\n", 3, "X-Bacon", 18.00);
		System.out.printf("| %-7d | %-18s | R$ %-12.2f |\n", 4, "Bauru", 12.00);
		System.out.printf("| %-7d | %-18s | R$ %-12.2f |\n", 5, "Refrigerante", 8.00);
		System.out.printf("| %-7d | %-18s | R$ %-12.2f |\n", 6, "Suco de Laranja", 13.00);
		System.out.println("--------------------------------------------------");
		
		System.out.println("\nDigite o código do produto: ");
		codigo = scanner.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		quantidade = scanner.nextInt();

		
		switch (codigo) {
		case 1:
			preco = 10f;
			System.out.println("Produto: Cachorro Quente");
			break;
		case 2:
			preco = 15f;
			System.out.println("Produto: X-Salada");
			break;
		case 3:
			preco = 18f;
			System.out.println("Produto: X-Bacon");
			break;	
		case 4:
			preco = 12f;
			System.out.println("Produto: Bauru");
			break;
		case 5:
			preco = 8f;
			System.out.println("Produto: Refrigerante");
			break;
		case 6:
			preco = 13f;
			System.out.println("Produto: Suco de Laranja");
			break;
			
		default:
			System.out.println("Opção inválida.");
		}
		
		valorTotal = quantidade * preco;
		System.out.printf("Valor Total: R$ %.2f", valorTotal);
		

	}

}
