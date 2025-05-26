

package Aula2_Ex12;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Porta p1 = new Porta("Vermelha");
        
        System.out.println("A porta "+p1.cor+" está aberta? ");
        System.out.println(p1.aberta);
        
        System.out.println("Feche a porta.");
        
        p1.fechar();
        
        System.out.println("A porta está aberta? ");
        System.out.println(p1.aberta);
        
        System.out.println("Abra a porta denovo.");
        
        p1.abrir();
        
        System.out.println("A porta foi aberta?");
        System.out.println(p1.abrir());
        
        
    }

}
