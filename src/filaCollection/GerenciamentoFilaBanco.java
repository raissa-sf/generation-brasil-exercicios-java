package filaCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GerenciamentoFilaBanco {

	public static void main(String[] args) {

		Queue<String> filaBanco = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		int codigo;
		String clienteNome;

		System.out.println("======================================================");
		System.out.println("                  SISTEMA BANCÁRIO                    ");
		System.out.println("======================================================");

		System.out.printf("| %-20s | %-25s |\n", "CÓDIGO DA OPERAÇÃO", "DESCRIÇÃO");
		System.out.println("------------------------------------------------------");

		System.out.printf("| %-20d | %-25s |\n", 1, "Adicionar Cliente");
		System.out.printf("| %-20d | %-25s |\n", 2, "Listar Clientes");
		System.out.printf("| %-20d | %-25s |\n", 3, "Retirar Cliente");
		System.out.printf("| %-20d | %-25s |\n", 4, "Ver Próximo Cliente");
		System.out.printf("| %-20d | %-25s |\n", 5, "Consultar Cliente");
		System.out.printf("| %-20d | %-25s |\n", 0, "Sair");

		System.out.println("------------------------------------------------------");

		do {
			System.out.print("\nDigite uma opção: ");
			codigo = scanner.nextInt();
			scanner.nextLine();

			switch (codigo) {
			case 1:
			    System.out.print("\nDigite o nome: ");
			    String novoCliente = scanner.nextLine(); 
			    filaBanco.add(novoCliente);

			    System.out.println("\nFila: ");
			    for (String c : filaBanco) {
			        System.out.println(c);
			    }
			    System.out.println("\n" + novoCliente + " agora está na fila!");
			    break;

			case 2:
				if (filaBanco.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					System.out.println("\nLista de Clientes na Fila: ");
					for (String cliente : filaBanco) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (filaBanco.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {

					String clienteChamado = filaBanco.poll();

					System.out.println("\nFila: ");
					for (String cliente : filaBanco) {
						System.out.println(cliente);
					}

					System.out.println("\n" + clienteChamado + " saiu da fila!");
				}
				break;
			case 4:
				if (filaBanco.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					System.out.println("\n" + filaBanco.peek() + " é a próxima pessoa da fila!");
				}
				break;
			case 5:
				if (filaBanco.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					System.out.println("Digite o nome para consultar: ");
					clienteNome = scanner.nextLine();
					if (filaBanco.contains(clienteNome)) {
						System.out.println(clienteNome + " está na fila!");
					} else {
						System.out.println(clienteNome + " não está na fila.");
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
