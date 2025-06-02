

package aula4ex6;

/**
 *
 * @author Luiz Ritter
 */
public class main {

    public static void main(String[] args) {
        
        MeioTransporte C = new Carro();
        
        System.out.println("Carro: ");
        C.mover();
        
        MeioTransporte A = new Aviao();
        System.out.println("Avião: ");
        A.mover();
        
        MeioTransporte N = new Navio();
        System.out.println("Navio: ");
        N.mover();
        
        
    }
    
    
    
}
