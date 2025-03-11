package ExerciciosLacoFor;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        double media = soma / 5;
        System.out.printf("A média dos números é: %.2f%n", media);
        scanner.close();
    }
}
