package aula4ex7;

/**
 *
 * @author Luiz Ritter
 */
public class PagamentoPix extends Pagamento {

    @Override
    public void processarPagamento(double valor) {

        System.out.println("Pagamento de " + valor + " efetuado com pix.");

    }

}
