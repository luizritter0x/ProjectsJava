package ExerciciosLacoFor;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número 1: ");
        double numero = scanner.nextDouble();
        double maior = numero;
        double menor = numero;

        for (int i = 2; i <= 7; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = scanner.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        scanner.close();
    }
}
