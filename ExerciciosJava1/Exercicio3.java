package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero real");
        double numero = teclado.nextDouble();
        double dobro = numero + 2;
        double tercaParte = numero / 3;
        
        System.out.println("O dobro do numero " +numero+ " é: " +dobro);
        System.out.println("A terça parte do numero " +numero+ " é " +tercaParte);
        
    }
    
}
