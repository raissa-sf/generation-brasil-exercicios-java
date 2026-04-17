package exercicio02;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2, nota3, nota4;
				
		System.out.println("Digite a primeira nota: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = scanner.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = scanner.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = scanner.nextFloat();
		
		float mediaNotas = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.printf("A média das notas inseridas é: %.1f", mediaNotas);

	}

}
