

package Atividades_DoWhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT5_Advinhação {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        Random rd = new Random();
        
        int palpite = 0;
        int tentativas = 0;
        int num = rd.nextInt(100);
         
        System.out.println("Adivinhe o número!");
        
        do{
            
            
            
            System.out.println("Digite o seu palpite:");
            palpite = tc.nextInt();
            tentativas ++;
            
           
            
            if (palpite <=num){
                
                System.out.println("O número é maior!");
                
            }
            if (palpite >= num ){
                
                System.out.println("O número é menor!");
                
            }
            
            
        }while (palpite != num);
        
        System.out.println("Você acertou em "+tentativas+"!");
    }
    
    
}
