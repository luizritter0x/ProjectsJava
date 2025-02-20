package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos anos a pessoa tem?");
        int idade = teclado.nextInt();
        
        if (idade >= 16) {
            
            System.out.println("A pessoa tem direito para votar");
        }else{
            System.out.println("A pessoa não tem direito para votar");
        }
    }
    
}
