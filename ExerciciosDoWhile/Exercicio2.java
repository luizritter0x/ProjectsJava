

package Atividades_DoWhile;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT2_MédiaDeNotas {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        
        double soma = 0;
        int cont = 1;
        double nota = 0;
        
        do {
            System.out.println("Digite a nota de 1 a 10: ");
            nota = tc.nextInt();
            
            
            if (nota >= 0){
            soma += nota;
            
            cont ++;
            
            }else{
                System.out.println("Número inválido!");
            }
            
        }while(cont <= 4);
        
        double media = soma/4;
        
        System.out.println("A média entre as idades é: "+media);
        
        
        
    
        
        
    }
    
    
    
}
