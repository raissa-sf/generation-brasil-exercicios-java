package vetorCollection;

import java.util.Scanner;

public class PesquisaVetor {

	public static void main(String[] args) {
		
		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		int numeroProcurado, posicao = -1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroProcurado = scanner.nextInt()
;		
		for (int i = 0; i < vetorInteiros.length && posicao == -1; i++) {
		    if (vetorInteiros[i] == numeroProcurado) {
		        posicao = i;
		    }
		}
		
		if(posicao == -1) {
			System.out.println("O número " + numeroProcurado + " não foi encontrado!");
		}else {
			System.out.println("O número " + numeroProcurado + " está na posição " + posicao);
		}
		
		scanner.close();
	}

}
