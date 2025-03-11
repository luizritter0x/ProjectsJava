package ExerciciosWhile;

import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro não negativo: ");
        numero = teclado.nextInt();

        while (numero < 0) {
            System.out.println("Número inválido! Digite um número inteiro não negativo.");
            System.out.print("Digite um número inteiro não negativo: ");
            numero = teclado.nextInt();
        }

        int fatorial = 1;
        int contador = 1;
        while (contador <= numero) {
            fatorial *= contador;
            contador++;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        teclado.close();
    }
}
