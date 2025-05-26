

package aula2ex7;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Circulo c1 = new Circulo( 0.00);
        
        System.out.println("Digite o raio do círculo: ");
        c1.raio = sc.nextDouble();
        
        c1.calcularArea();
        
        System.out.println("A área do círculo é: "+c1.calcularArea());
        
        c1.calcularCircunferencia();
        
        System.out.println("A circunferência do círculo é: "+c1.calcularCircunferencia());
        
        
        
    }
    
    
}
