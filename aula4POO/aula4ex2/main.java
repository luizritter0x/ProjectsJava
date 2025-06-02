

package aula4ex2;

/**
 *
 * @author Luiz Ritter
 */
public class main {
    public static void main(String[] args) {
        
        Animal c = new Cachorro();
        
        
        System.out.println("O cachorro faz?");
        
        c.emitirSom();
        
        Animal g = new Gato();
        
        System.out.println("O gato faz?");
        g.emitirSom();
        
        
        Animal v = new Vaca();
        
        System.out.println("A vaca faz?");
        
        v.emitirSom();
    }
}
