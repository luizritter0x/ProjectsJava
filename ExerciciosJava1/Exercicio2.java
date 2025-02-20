
package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um numero inteiro");
        int num = teclado.nextInt();
        int antecessor = num + 1;
        int sucessor = num - 1;
        
        System.out.println("Antecessor: " +sucessor);
        System.out.println("Sucessor: " +antecessor);
        
    }
}
