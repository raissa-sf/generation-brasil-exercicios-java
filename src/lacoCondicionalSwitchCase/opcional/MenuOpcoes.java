package lacoCondicionalSwitchCase.opcional;

import java.util.Scanner;

public class MenuOpcoes {

	public static void main(String[] args) {
		
		int opcao;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("====== MENU DE CONFIGURAÇÕES ======");
		System.out.println("Escolha uma opção de 1 a 3: ");
		opcao = scanner.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Alterar senha");
			break;
			
		case 2:
			System.out.println("Alterar idioma");
			break;
			
		case 3:
			System.out.println("Sair");
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
			
		}
		
		scanner.close();

	}

}
