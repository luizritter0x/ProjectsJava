

package ex6;

/**
 *
 * @author Aluno
 */
public class Main {

    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel;
    
    void emprestar(){
        
        if(disponivel){
            disponivel = false;
            System.out.println("Livro "+titulo+" emprestado com sucesso.");
        }else{
            System.out.println("Livro "+titulo+" não está disponível para empréstimo.");
        }
        
    }
    
    void devolver(){
        
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro "+titulo+" devolvido com sucesso.");
        }else{
            System.out.println("Livro "+titulo+" já está dísponivel.");
        }
        
    }
    
    
    
}
