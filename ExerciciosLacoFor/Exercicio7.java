package ExerciciosLacoFor;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o número final: ");
        int fim = scanner.nextInt();
        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        for (int i = inicio; i <= fim; i += incremento) {
            System.out.println(i);
        }
        scanner.close();
    }
}

