package arrayListCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PesquisaArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> inteiros = new ArrayList<>(List.of(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		Scanner scanner = new Scanner(System.in);
		int numeroProcurado, posicao = -1;

		System.out.print("Digite o número que você deseja encontrar: ");
		numeroProcurado = scanner.nextInt();

		posicao = inteiros.indexOf(numeroProcurado);

		if (posicao == -1) {
			System.out.println("O número " + numeroProcurado + " não foi encontrado!");
		} else {
			System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
		}

		scanner.close();
	}

}
