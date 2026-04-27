package arrayListCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenaCores {

public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		// 1. Entrada de dados
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite uma cor: ");
			cores.add(scanner.nextLine());
		}
		
		// 2. Listar todas as cores (na ordem que foram digitadas)
		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		// 3. Ordenar a lista
		Collections.sort(cores); // Primeiro você ordena...
		
		// 4. Mostrar as cores ordenadas
		System.out.println("\nOrdenar as cores:");
		for (String cor : cores) { // ...depois você imprime de novo
			System.out.println(cor);
		}

		scanner.close();
	}
}