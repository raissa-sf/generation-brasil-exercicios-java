package lacoCondicionalSwitchCase.opcional;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		int numero1, numero2, resultado = 0;
		char operacao;
		boolean operacaoValida = true;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro número: ");
		numero2 = scanner.nextInt();
		
		System.out.println("Digite uma operação (+ - * /): ");
		operacao = scanner.next().charAt(0);
		
		switch (operacao) {
		
		case '+':
			resultado = numero1 + numero2;
			break;
		
		case '-':
			resultado = numero1 - numero2;
			break;
		
		case '*':
			resultado = numero1 * numero2;
			break;
			
		case '/':
			resultado = numero1 / numero2;
			break;
			
		default:
			System.out.println("Operação inválida!");
			operacaoValida = false;
			break;
		}
		
		if (operacaoValida) {
		    System.out.println(numero1 + " " + operacao + " " + numero2 + " = " + resultado);
		}
		
		scanner.close();

	}

}
