package lacoCondicionalSwitchCase;

import java.util.Scanner;

public class CalculoReajuste {

    public static void main(String[] args) {
        
        int codigo;
        float salario, novoSalario, reajuste = 0;
        String nome, cargo = ""; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("##################################################");
        System.out.println("##                Cargos Funcionários           ##");
        System.out.println("##################################################");

        System.out.printf("| %-7s | %-18s | %-15s |\n", "Código", "Cargo", "Reajuste");
        System.out.println("--------------------------------------------------");
        System.out.printf("| %-7d | %-18s | %-15s |\n", 1, "Gerente", "10%");
        System.out.printf("| %-7d | %-18s | %-15s |\n", 2, "Vendedor", "7%");
        System.out.printf("| %-7d | %-18s | %-15s |\n", 3, "Supervisor", "9%");
        System.out.printf("| %-7d | %-18s | %-15s |\n", 4, "Motorista", "6%");
        System.out.printf("| %-7d | %-18s | %-15s |\n", 5, "Estoquista", "5%");
        System.out.printf("| %-7d | %-18s | %-15s |\n", 6, "Técnico de TI", "8%");
        System.out.println("--------------------------------------------------");
        
        System.out.println("\nDigite o nome do colaborador: ");
        nome = scanner.nextLine();
        System.out.println("Digite o código do cargo: ");
        codigo = scanner.nextInt();
        System.out.println("Digite o valor do salário: ");
        salario = scanner.nextFloat();

        switch (codigo) {
            case 1:
                reajuste = 0.10f; 
                cargo = "Gerente";
                break;
            case 2:
                reajuste = 0.07f; 
                cargo = "Vendedor";
                break;
            case 3:
                reajuste = 0.09f; 
                cargo = "Supervisor";
                break;    
            case 4:
                reajuste = 0.06f; 
                cargo = "Motorista";
                break;
            case 5:
                reajuste = 0.05f; 
                cargo = "Estoquista";
                break;
            case 6:
                reajuste = 0.08f; 
                cargo = "Técnico de TI";
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }
        
        novoSalario = salario + (reajuste * salario);
        
        System.out.println("\n-----------------------------------------");
        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Novo Salário Reajustado: R$ %.2f\n", novoSalario);
        
        scanner.close();
    }
}