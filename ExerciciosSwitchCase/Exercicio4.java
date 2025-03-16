package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio4 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma bebida:");
        System.out.println("1. Refrigerante");
        System.out.println("2. Suco");
        System.out.println("3. Água");
        
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Refrigerante");
                break;
            case 2:
                System.out.println("Você escolheu Suco");
                break;
            case 3:
                System.out.println("Você escolheu Água");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}