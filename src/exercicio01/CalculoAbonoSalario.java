package exercicio01;

import java.util.Scanner;

public class CalculoAbonoSalario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float salario, abono;

		System.out.println("Digite o salário: ");
		salario = scanner.nextFloat();
		System.out.println("Digite o abono: ");
		abono = scanner.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.printf("Seu novo salário é: %.2f", novoSalario);
				

	}

}
