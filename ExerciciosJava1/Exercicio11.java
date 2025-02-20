package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual a velocidade do carro");
        int velocidade = teclado.nextInt();
        
        if (velocidade > 80) {
            
            double multa = 5;
            double excesso = (velocidade -80);
            double valorMulta = (excesso * multa);
            
            System.out.println("O motorista foi multado em " +valorMulta+ "REAIS");

        }else{
            System.out.println("O motorista não foi multado");
        }                        
    }
    
}
