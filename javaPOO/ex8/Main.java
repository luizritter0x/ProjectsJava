package ex8;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        produto prod = new produto();
        
        System.out.println("Qual o nome do produto?");
        prod.nome = sc.nextLine();
        
        System.out.println("Digite o preço do produto:");
        prod.preco = sc2.nextDouble();
        
        System.out.println("Qual a quantidade em estoque?");
        prod.quantEmEstoque = sc3.nextInt();
        
        System.out.println("Deseja vender o repor o estoque?");
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("vender")){
            
            System.out.println("Qual a quantidade que deseja vender?");
            
            
            
            
            System.out.println("Estoque atual é: "+prod.vender(sc.nextInt()));
            
        }else if(opcao.equalsIgnoreCase("repor")){
            
            System.out.println("Qual a quantidade que você deseja repor?");
            
            
            
            
            System.out.println("Estoque atual é: "+prod.reporEstoque(sc.nextInt()));
            
        }
        
        
        
        
        
    }
    
    
}
