package lacoCondicionalSwitchCase.opcional;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		
		int numero;
		String dia = "";
		boolean numeroValido = true;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		numero = scanner.nextInt();
		
		switch (numero) {
		
		case 1:
			dia = "Domingo";
			break;
			
		case 2:
			dia = "Segunda";
			break;
			
		case 3:
			dia = "Terça";
			break;
			
		case 4:
			dia = "Quarta";
			break;
			
		case 5:
			dia = "Quinta";
			break;
		
		case 6:
			dia = "Sexta";
			break;
			
		case 7:
			dia = "Sábado";
			break;
			
		default:
			System.out.println("Número inválido!");
			numeroValido = false;
			break;
		}
		
		if (numeroValido) {
			
			System.out.println("O dia correspondente para o número " + numero + " é: " + dia);
		}
		
		scanner.close();

	}

}
