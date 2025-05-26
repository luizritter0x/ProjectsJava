

package aula2ex2e18conta;

/**
 *
 * @author Aluno
 */
public class ContaBancaria {

    int numConta;
    
    double saldo;
    
    String titular;

    public ContaBancaria(int numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    
    double depositar(double valor){
        
        
        
      double deposito = saldo + valor;
        
        return deposito;
    }
    
    double sacar(double valor){
        
        
        
        
        double saque = saldo - valor;
        
        return saque;
    }
    
    
    
}
