package ExerciciosLacoFor;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            double idade = scanner.nextDouble();
            soma += idade;
        }
        double media = soma / 5;
        System.out.printf("A média das idades é: %.2f%n", media);
        scanner.close();
    }
}