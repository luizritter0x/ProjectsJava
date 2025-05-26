

package aula2ex17livro;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        Livro l1 = new Livro("titulo1", "autor1");
        
        Livro l2 = new Livro("titulo2", "autor2", 2002);
        
        
        System.out.println("Livro 1: ");
        System.out.println("Titulo livro 1: "+l1.titulo );
        System.out.println("Autor livro 1: "+l1.autor );
        
        System.out.println("Livro 2:");
        System.out.println("Titulo livro 2: "+l2.titulo );
        System.out.println("Autor livro 2: "+l2.autor );
        System.out.println("Ano de publicação: "+l2.anoPubli );
        
        
        
        
        
        
    }

}
