package ExerciciosSlide;

import java.util.Scanner;

public class ContagemAteNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int contador = 0;
            
            while (contador <= numero) {
                System.out.println(contador);
                contador++;
            }
        }
    }
}