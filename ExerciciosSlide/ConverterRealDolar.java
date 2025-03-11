package ExerciciosSlide;

import java.util.Scanner;

public class ConverterRealDolar {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double cotacaoDolar = 5.45; // Cotação do dólar
            System.out.print("Quantas vezes você quer converter? ");
            int vezes = teclado.nextInt();
            int contador = 1;
            
            while (contador <= vezes) {
                System.out.print("Qual é o valor em R$? ");
                double valorReais = teclado.nextDouble();
                double valorDolares = valorReais / cotacaoDolar;
                System.out.printf("O valor convertido é US$ %.2f%n", valorDolares);
                contador++;
            }
        } // Cotação do dólar
    }
}