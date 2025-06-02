

package aula4ex3;

/**
 *
 * @author Luiz RItter
 */
public class Vendedor extends Funcionario{

    private int vendas;
    
    
    public Vendedor(String nome, double salario, int vendas) {
        super(nome, salario);
        this.vendas = vendas;
    }

    
    
    
    @Override
    public double calcularBonus() {
        
        return vendas * 10.0; // Bônus de R$ 10 por venda.
        
        
    }

}
