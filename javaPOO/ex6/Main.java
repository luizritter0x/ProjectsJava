

package ex6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        Livro livro = new Livro();
        
        
        System.out.println("Digite o titulo do livro: ");
        livro.titulo = sc.nextLine();
        
        System.out.println("Digite o autor do livro: ");
        livro.autor = sc.nextLine();
        
        System.out.println("Digite o ano da publicação: ");
        livro.anoPublicacao = sc2.nextInt();
        
        livro.disponivel = true;
        
        System.out.println("## Informações do livro cadastrado ##");
        System.out.println("Título: "+livro.titulo);
        
        System.out.println("Autor: "+livro.autor);
        System.out.println("Ano de Publicação: "+livro.anoPublicacao);
         
        
        System.out.println("\n Deseja emprestar o livro? (s/n)");
        //Consumir nova linha
        
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("s")){
            livro.emprestar();
        }
        
        System.out.println("\n Deseja devolver o livro? (s/n)");
        opcao = sc.nextLine();
        if(opcao.equalsIgnoreCase("s")){
            livro.devolver();
        }
        
        sc.close();
        
    }
    
    
}
