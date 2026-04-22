package entradaSaida;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
				
		System.out.println("Digite o valor do salário bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.println("Digite o valor das horas extras: ");
		horasExtras = scanner.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = scanner.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.printf("O valor do salário líquido é: %.2f", salarioLiquido);

	}

}
