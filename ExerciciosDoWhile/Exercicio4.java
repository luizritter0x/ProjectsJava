

package Atividades_DoWhile;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT4_MenuDeOpções {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        String resp = null;
        
        
        do{
            
            System.out.println("Menu de opções");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Consultar");
            System.out.println("[3] - Sair");
            resp = tc.nextLine();
            
            
            
            
            
            
            
        }while(!resp.equalsIgnoreCase("sair"));
        
        
        
        
    }
    
    
}
