package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio9 {
    
    public static void main(String[] args) {
       
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Quantos km foi rodado com o carro");
        double km = teclado.nextDouble();
        
        System.out.println("Quantos dias o carro foi alugado?");
        double dias = teclado.nextDouble();
        
        double precoTotal = (dias * 90) + (km * 0.90);
                
               System.out.println("O preco final é: " +precoTotal);
    
    }
    
}
