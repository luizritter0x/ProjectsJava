

package aula2ex5;

/**
 *
 * @author Aluno
 */
public class Produto {

    String nome;
    double preço;
    int quantEmEstoque;

    public Produto(String nome, double preço, int quantEmEstoque) {
        this.nome = nome;
        this.preço = preço;
        this.quantEmEstoque = quantEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantEmEstoque() {
        return quantEmEstoque;
    }

    public void setQuantEmEstoque(int quantEmEstoque) {
        this.quantEmEstoque = quantEmEstoque;
    }
    
    
    int vender(int quantidade){
        
       
        
        
        int venda = quantEmEstoque - quantidade;
        
        
        
       return venda; 
    }
    
    
    
}
