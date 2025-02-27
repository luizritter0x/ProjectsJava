package ExerciciosJava2;

import java.util.Scanner;

public class InversorPalavra {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("Digite uma palavra");
            String palavra = teclado.nextLine();
            
            String inverterPalavra = new StringBuilder(palavra).reverse().toString();
            
            System.out.println("A palavra " +palavra+ " sendo invertida fica: " +inverterPalavra);
    }
}