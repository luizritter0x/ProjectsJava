

package aula2ex6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Retangulo r1 = new Retangulo(0.00, 0.00);
        
        
        System.out.println("Digite o valor da largura do retângulo: ");
        r1.largura = sc.nextDouble();
        
        System.out.println("Digite a altura do retângulo: ");
        r1.altura = sc.nextDouble();
        
        r1.calcularArea();
        System.out.println("A área do retângulo é: "+r1.calcularArea());
        
        System.out.println("O perímetro do retângulo é: "+r1.calcularPerimetro());
        
        
        
    }

}
