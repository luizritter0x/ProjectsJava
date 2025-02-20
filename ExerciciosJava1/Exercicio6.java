package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a altura da parede");
        double altura = teclado.nextDouble();
        
        System.out.println("Digite a largua da parede");
        double largura = teclado.nextDouble();
        
        double area = altura * largura;
        System.out.println("A area da parede é " +area);        
                
       double tinta = area / 2;         
       
        System.out.println("A quantidade de tinta necessaria é:"+tinta);
    }
    
}
