package matrizCollection;

import java.util.Scanner;

public class MediasMatriz {

	public static void main(String[] args) {
		
		float [][] matriz = new float[10][4];
		float[] medias = new float[10]; 
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
		    float somaDesteAluno = 0; 
		    System.out.println("Aluno " + (i + 1) + ": ");
		    
		    for (int j = 0; j < 4; j++) {
		        System.out.print("Digite a nota do " + (j + 1) + "º bimestre: ");
		        matriz[i][j] = scanner.nextFloat();
		        somaDesteAluno += matriz[i][j]; 
		    }
		    
		    medias[i] = somaDesteAluno / 4;
		    
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
   
            System.out.printf("|%.1f |", medias[i]);
        }
        
        scanner.close();
		
		

	}

}
