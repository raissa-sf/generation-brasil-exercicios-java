package loopFor;

import java.util.Scanner;

public class MultiplosIntervalo {

	public static void main(String[] args) {

		int numero1, numero2;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		numero1 = scanner.nextInt();

		System.out.println("Digite o segundo número: ");
		numero2 = scanner.nextInt();

		if (numero1 < numero2) {

			for (int contador = numero1; contador <= numero2; contador++) {

				if (contador % 3 == 0 && contador % 5 == 0 && contador != 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo inválido!");
		}

		scanner.close();
	}

}
