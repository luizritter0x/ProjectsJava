

package aula2ex5;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Produto p1 = new Produto("Arroz", 15.0, 100);
        
        System.out.println("Informações do produto: ");
        System.out.println("Nome: "+p1.nome);
        System.out.println("Preço: "+p1.preço);
        System.out.println("Preço: "+p1.quantEmEstoque);
        
        System.out.println("Qual a quantidade de "+p1.nome+" vai ser vendido?");
        
        
        System.out.println("Estoque após a venda: "+p1.vender(sc.nextInt()));
        
        
        
        
        
        
        
    }
    
    

}
