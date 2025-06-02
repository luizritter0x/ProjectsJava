package aula4ex7;

/**
 *
 * @author Luiz Ritter
 */
public class PagamentoCartao extends Pagamento {

    @Override
    public void processarPagamento(double valor) {

        System.out.println("Pagamento de " + valor + " efetuado no Cartao.");

    }

}
