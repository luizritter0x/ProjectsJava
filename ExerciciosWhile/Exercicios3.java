package ExerciciosWhile;

import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = teclado.nextInt();

        while (numero <= 0) {
            System.out.println("Número inválido! Digite um número inteiro positivo.");
            System.out.print("Digite um número inteiro positivo: ");
            numero = teclado.nextInt();
        }

        int contador = 1;
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
        
        teclado.close();
    }
}
