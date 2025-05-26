

package aula2ex4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        Livro livro1 = new Livro("Titulo", "Autor", 2015, true);
        
        System.out.println("Digite o título do livro: ");
        livro1.titulo = sc.nextLine();
        System.out.println("Digite o nome do autor: ");
        livro1.autor = sc.nextLine();
        System.out.println("Digite o ano de publicação: ");
        livro1.anoPublicacao = sc2.nextInt();
        System.out.println("O livro está disponível?");
        String resposta = sc.nextLine();
        if(resposta.equalsIgnoreCase("sim")){
            
            livro1.disponivel = true;
            System.out.println("Quer alugar o livro? (sim/nao)");
            String opcao = sc.nextLine();
            if(opcao.equalsIgnoreCase("sim")){
                livro1.emprestar();
            }else if(opcao.equalsIgnoreCase("nao")){
                
                System.out.println("Quer devolver o livro? (sim/nao)");
                opcao = sc.nextLine();
                if(opcao.equalsIgnoreCase("sim")){
                    livro1.devolver();
                }else{
                    System.out.println("Faz o que aqui então?");
                }
                
            }
            
        }else if(resposta.equalsIgnoreCase("nao")){
            
            livro1.disponivel = false;
            
            System.out.println("Quer devolver o livro? (sim/nao)");
            String opcao = sc.nextLine();
            if(opcao.equalsIgnoreCase("sim")){
                livro1.devolver();
                System.out.println("Livro devolvido.");
            }else if(opcao.equalsIgnoreCase("nao")){
                
                System.out.println("Quer alugar o livro? (sim/nao)");
                opcao = sc.nextLine();
                if(opcao.equalsIgnoreCase("sim")){
                    livro1.emprestar();
                }else{
                    System.out.println("Faz o que aqui então?");
                }
                
            }
            
        }
        
        
        
        
        
        
    }
    
    
}
