

package aula2ex8;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Aluno A1 = new Aluno("Vitor", 1521);
        
        System.out.println("Informações do aluno: ");
        System.out.println("Nome: "+A1.aluno);
        System.out.println("Matrícula: "+A1.matrícula);
        
        
        A1.calcularMedia();
        
        System.out.println("A média das notas do "+A1.aluno+" é "+A1.calcularMedia());
        
        
        
        
    }
    

}
