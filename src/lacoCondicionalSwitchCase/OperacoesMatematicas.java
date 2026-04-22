package lacoCondicionalSwitchCase;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {

		float numero1, numero2, resultado = 0;
		int codigo;
		Scanner scanner = new Scanner(System.in);

		System.out.println("##################################################");
		System.out.println("##               Quadro Operações               ##");
		System.out.println("##################################################");

		System.out.printf("| %-7s | %-18s |\n", "Código", "Operação"); 
		System.out.println("--------------------------------------------------");
		System.out.printf("| %-7d | %-18s |\n", 1, "Soma");
		System.out.printf("| %-7d | %-18s |\n", 2, "Subtração");
		System.out.printf("| %-7d | %-18s |\n", 3, "Multiplicação");
		System.out.printf("| %-7d | %-18s |\n", 4, "Divisão");
		System.out.println("--------------------------------------------------");

		System.out.print("\nDigite o 1º número: ");
		numero1 = scanner.nextFloat();
		System.out.print("Digite o 2º número: ");
		numero2 = scanner.nextFloat();
		System.out.print("Digite o código da operação: ");
		codigo = scanner.nextInt();

		System.out.println(); 

		switch (codigo) {
		case 1:
			resultado = numero1 + numero2;
			System.out.printf("%.1f + %.1f = %.1f\n", numero1, numero2, resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.printf("%.1f - %.1f = %.1f\n", numero1, numero2, resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.printf("%.1f * %.1f = %.1f\n", numero1, numero2, resultado);
			break;
		case 4:
			if (numero2 != 0) {
				resultado = numero1 / numero2;
				System.out.printf("%.1f / %.1f = %.1f\n", numero1, numero2, resultado);
			} else {
				System.out.println("Erro: Não é possível dividir por zero!");
			}
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}

		scanner.close();
	}
}