package ExerciciosSlide;

import java.util.Scanner;

public class ContagemIncremento {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite o número inicial: ");
            int inicio = teclado.nextInt();
            System.out.print("Digite o número final: ");
            int fim = teclado.nextInt();
            System.out.print("Digite o incremento: ");
            int incremento = teclado.nextInt();
            
            int contador = inicio;
            while (contador <= fim) {
                System.out.println(contador);
                contador += incremento;
            }
        }
    }
}