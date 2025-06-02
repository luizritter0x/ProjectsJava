

package aula4ex7;

/**
 *
 * @author Luiz Ritter
 */
public class main {

    public static void main(String[] args) {
        
        Pagamento C = new PagamentoCartao();
        Pagamento B = new PagamentoBoleto();
        Pagamento P = new PagamentoPix();
        
        C.processarPagamento(500);
        
        
        B.processarPagamento(250);
        
        
        P.processarPagamento(1000);
        
        
        
    }
 
    
   
    
}
