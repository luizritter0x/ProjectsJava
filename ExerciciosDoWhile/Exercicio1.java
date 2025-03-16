

package Atividades_DoWhile;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT1_SomaDosNúmeros {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int soma = 0;
        
        
        
        
        int resp;
        
        do{
            System.out.println("Digite um número para somar:");
            int num = tc.nextInt();
            
            soma += num;
            
            
            System.out.println("Para parar digite '0'");
            resp = tc.nextInt();
            
            
        }while(resp != 0);
        System.out.println("A soma dos números é: "+soma);
        tc.close();
        
        
    }
    
    
    
}
