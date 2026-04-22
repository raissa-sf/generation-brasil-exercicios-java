package lacoCondicionalSwitchCase;

import java.util.Scanner;

public class SimuladorCaixaEletronico {

	public static void main(String[] args) {
		
		float valor, saldo = 1000.00f;
		int codigo;
		Scanner scanner = new Scanner(System.in);

		System.out.println("==========================================");
		System.out.println("       SISTEMA BANCÁRIO - OPERAÇÕES         ");
		System.out.println("==========================================");

		System.out.printf("| %-20s | %-15s |\n", "CÓDIGO DA OPERAÇÃO", "OPERAÇÃO"); 
		System.out.println("------------------------------------------");
		System.out.printf("| %-20d | %-15s |\n", 1, "Saldo");
		System.out.printf("| %-20d | %-15s |\n", 2, "Saque");
		System.out.printf("| %-20d | %-15s |\n", 3, "Depósito");
		System.out.println("------------------------------------------");

		System.out.print("\nDigite o código da operação: ");
		codigo = scanner.nextInt();
		System.out.println(); 

		switch (codigo) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: %.2f" , saldo);
			break;
		case 2:
			System.out.println("Operação - Saque");
			System.out.println("Insira o valor a ser sacado: ");
			valor = scanner.nextFloat();
			if (valor > saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				saldo = saldo - valor;
				System.out.printf("Novo saldo: %.2f", saldo);
			}
			break;
		case 3:
			System.out.println("Operação - Depósito");
			System.out.println("Insira o valor a ser depositado: ");
			valor = scanner.nextFloat();
			
			saldo = saldo + valor;
			System.out.printf("Novo saldo: %.2f" , saldo);
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}

		scanner.close();

	}

}
