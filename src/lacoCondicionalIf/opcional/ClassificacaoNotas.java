package lacoCondicionalIf.opcional;

import java.util.Scanner;

public class ClassificacaoNotas {

	public static void main(String[] args) {

		int nota;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite uma nota entre 0 e 100: ");
		nota = scanner.nextInt();
		
		if (nota >= 90 && nota <= 100){
			
			System.out.println("Correspondência de " + nota + ": A");
			
		}else if (nota >= 80 && nota < 90 ) {
			
			System.out.println("Correspondência de " + nota + ": B");
			
		}else if (nota >= 70 && nota < 80 ) {
			
			System.out.println("Correspondência de " + nota + ": C");
		
		}else if (nota >= 60 && nota < 70 ) {
			
			System.out.println("Correspondência de " + nota + ": D");
			
		}else if (nota >= 0 && nota < 60 ) {
			
			System.out.println("Correspondência de " + nota + ": F");
			
		}else {
			
			System.out.println("Nota inválida!");
		}
		
		scanner.close();
		
	}

}
