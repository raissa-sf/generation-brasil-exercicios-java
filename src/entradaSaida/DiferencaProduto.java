package entradaSaida;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float n1, n2, n3, n4;
				
		System.out.println("Digite o primeiro numero: ");
		n1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		n2 = scanner.nextFloat();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = scanner.nextFloat();
		
		System.out.println("Digite o quarto numero: ");
		n4 = scanner.nextFloat();
		
		float calculoDiferenca = (n1 * n2) - (n3 * n4);
		System.out.printf("A diferença do produto de n1 e n2 pelo produto de n3 e n4 é: %.1f", calculoDiferenca);


	}

}
