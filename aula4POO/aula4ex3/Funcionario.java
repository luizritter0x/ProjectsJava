

package aula4ex3;

/**
 *
 * @author Luiz RItter
 */
public abstract class Funcionario {

    String nome;
    
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    
    
    
    
    public abstract double calcularBonus();
    
    
    
    
    
}
