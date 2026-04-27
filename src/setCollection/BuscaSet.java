package setCollection;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BuscaSet {

	public static void main(String[] args) {
		
		Set<Integer> inteiros = new HashSet<>(List.of(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		Scanner scanner = new Scanner(System.in);
        int numeroProcurado;

        System.out.print("Digite o número que você deseja encontrar: ");
        numeroProcurado = scanner.nextInt();

        if (inteiros.contains(numeroProcurado)) {
            System.out.println("O número " + numeroProcurado + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }

        scanner.close();

	}

}
