package ExerciciosSlide;

import java.util.Scanner;

public class ContagemInteligente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("--------------------");
        System.out.print("Inicio: ");
        int inicio = scanner.nextInt();
        System.out.print("Fim: ");
        int fim = scanner.nextInt();
        System.out.println("--------------------");
        System.out.println("     CONTANDO");
        System.out.println("--------------------");
        
        if (inicio < fim) {
            int contador = inicio;
            while (contador <= fim) {
                System.out.print(contador + " ");
                contador++;
            }
        } else {
            int contador = inicio;
            while (contador >= fim) {
                System.out.print(contador + " ");
                contador--;
            }
        }
        System.out.println();
        scanner.close();
    }
}
