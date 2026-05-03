package lacoCondicionalSwitchCase.opcional;

import java.util.Scanner;

public class ClassificacaoNotas {

    public static void main(String[] args) {

        char nota;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota (A a F): ");
        nota = scanner.next().toUpperCase().charAt(0);

        switch (nota) {

            case 'A':
                System.out.println("Excelente");
                break;

            case 'B':
                System.out.println("Bom");
                break;

            case 'C':
                System.out.println("Médio");
                break;

            case 'D':
                System.out.println("Ruim");
                break;

            case 'F':
                System.out.println("Insuficiente");
                break;

            default:
                System.out.println("Nota inválida");
                break;
        }

        scanner.close();
    }
}