package lacoCondicionalSwitchCase.opcional;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		
		 int idade, faixa;
	        String descricao;

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite sua idade: ");
	        idade = scanner.nextInt();

	        if (idade < 0) {
	            System.out.println("Idade inválida");
	        } else {

	            if (idade <= 12) {
	                faixa = 1;
	            } else if (idade <= 19) {
	                faixa = 2;
	            } else if (idade <= 59) {
	                faixa = 3;
	            } else {
	                faixa = 4;
	            }

	            switch (faixa) {
	                case 1:
	                    descricao = "Criança";
	                    break;
	                case 2:
	                    descricao = "Adolescente";
	                    break;
	                case 3:
	                    descricao = "Adulto";
	                    break;
	                case 4:
	                    descricao = "Idoso";
	                    break;
	                default:
	                    descricao = "Inválido";
	            }

	            System.out.println("Você é " + descricao);
	        }

	        scanner.close();
	}

}
