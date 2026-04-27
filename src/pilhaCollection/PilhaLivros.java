package pilhaCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PilhaLivros {

	public static void main(String[] args) {
		
		Deque<String> pilhaLivro = new ArrayDeque<>();
		Scanner scanner = new Scanner(System.in);
		int codigo;

		System.out.println("======================================================");
		System.out.println("                SISTEMA BIBLIOTECA                    ");
		System.out.println("======================================================");

		System.out.printf("| %-20s | %-25s |\n", "CÓDIGO DA OPERAÇÃO", "DESCRIÇÃO");
		System.out.println("------------------------------------------------------");

		System.out.printf("| %-20d | %-25s |\n", 1, "Adicionar Livro");
		System.out.printf("| %-20d | %-25s |\n", 2, "Listar Livros");
		System.out.printf("| %-20d | %-25s |\n", 3, "Retirar Livro");
		System.out.printf("| %-20d | %-25s |\n", 4, "Ver Próximo Livro");
		System.out.printf("| %-20d | %-25s |\n", 5, "Consultar Livro");
		System.out.printf("| %-20d | %-25s |\n", 0, "Sair");

		System.out.println("------------------------------------------------------");

		do {
			System.out.print("\nDigite uma opção: ");
			codigo = scanner.nextInt();
			scanner.nextLine();
			String livroTitulo;

			switch (codigo) {
			case 1:
			    System.out.print("\nDigite o titulo do livro: ");
			    String novoLivro = scanner.nextLine(); 
			    pilhaLivro.add(novoLivro);

			    System.out.println("\nPilha: ");
			    for (String c : pilhaLivro) {
			        System.out.println(c);
			    }
			    System.out.println("\nO livro " + novoLivro + " agora está na pilha!");
			    break;

			case 2:
				if (pilhaLivro.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("\nLista de livros na pilha: ");
					for (String livro : pilhaLivro) {
						System.out.println(livro);
					}
				}
				break;

			case 3:
				if (pilhaLivro.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {

					String livroRetirado = pilhaLivro.poll();

					System.out.println("\nPilha: ");
					for (String livro : pilhaLivro) {
						System.out.println(livro);
					}

					System.out.println("\nO livro " + livroRetirado + " foi retirado da pilha!");
				}
				break;
			case 4:
				if (pilhaLivro.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("\nO livro " + pilhaLivro.peek() + " é o próximo livro da pilha!");
				}
				break;
			case 5:
				if (pilhaLivro.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("Digite um titulo para consultar: ");
					livroTitulo = scanner.nextLine();
					if (pilhaLivro.contains(livroTitulo)) {
						System.out.println("\nO livro " + livroTitulo + " está na pilha!");
					} else {
						System.out.println("\nO livro " +livroTitulo + " não está na pilha.");
					}
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida!");

			}

		} while (codigo != 0);

		scanner.close();

	}

}
