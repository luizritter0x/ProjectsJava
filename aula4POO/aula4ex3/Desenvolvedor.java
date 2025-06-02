

package aula4ex3;

/**
 *
 * @author Luiz RItter
 */
public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        
        return salario * 0.20; // Bônus de 20% 
        
        
    }

}
