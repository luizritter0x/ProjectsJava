package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos reais voce tem?");
        double real = teclado.nextDouble();
        double cota = 5.45;
        double conversao = real / cota;
                
        System.out.println("Com essa quantidade de reais, voce tera em dolares" +String.format("%.4f", conversao));    
      
    }
    
}
