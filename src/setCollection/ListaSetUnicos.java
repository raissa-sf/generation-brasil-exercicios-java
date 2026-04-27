package setCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ListaSetUnicos {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros (não repetidos):");

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			int numero = scanner.nextInt();
			setNumeros.add(numero); 
		}

		System.out.println("\nListar dados do Set:");

		Iterator<Integer> iSet = setNumeros.iterator();

		while (iSet.hasNext()) {
			System.out.println(iSet.next());
		}

		scanner.close();

	}

}
