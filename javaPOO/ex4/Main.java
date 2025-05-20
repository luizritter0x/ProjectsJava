package ex4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Circulos circulo = new Circulos();
        
        System.out.println("Digite o valor do raio do círculo: ");
        circulo.raio = sc.nextDouble();
        
        System.out.println("O valor da área do círculo é: "+circulo.calcularArea());
        
        System.out.println("O valor da área do círculo é: "+circulo.calcularCircunferencia());
        
        
        
    }
    
}
