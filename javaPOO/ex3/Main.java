

package ex3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Retangulos retangulo = new Retangulos();
        
        System.out.println("Digite o valor da base do retângulo.");
        retangulo.base = sc.nextDouble();
        
        System.out.println("Digite o valor da altura do retângulo.");
        retangulo.altura = sc.nextDouble();
        
        System.out.println("O valor da area do retângulo é "+retangulo.calcularArea());
        
        System.out.println("O valor do perímetro do retângulo é "+retangulo.calcularPerimetro());
        
    }
    
}
