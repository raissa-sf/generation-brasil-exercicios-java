package lacoCondicionalIf.opcional;

import java.util.Scanner;

public class VerificacaoMaioridade {

	public static void main(String[] args) {
		
		int idade;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você já atingiu a maioridade!");
		}else if (idade > 15 && idade < 18){
			System.out.println("Você está quase atingindo a maioridade!");
		}else {
			System.out.println("Você ainda não atingiu a maioridade. Falta muito!");
		}
		
		scanner.close();
	}

}
