package ExerciciosLacoFor;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print(caractere);
        }
        System.out.println();
        scanner.close();
    }
}
