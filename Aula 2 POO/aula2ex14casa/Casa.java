

package aula2ex14casa;

/**
 *
 * @author Aluno
 */





public class Casa {
    
    int numero;
    String cor;
    
    public pessoa proprietario;

    public Casa(int numero, String cor, pessoa proprietario) {
        this.numero = numero;
        this.cor = cor;
        this.proprietario = proprietario;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(pessoa proprietario) {
        this.proprietario = proprietario;
    }
    
    
    class pessoa{
        
        String nome;
        
        pessoa(String nome){
            this.nome = nome;
        }
        
        public String getNome(){
            
            return nome;
        }
        
    }

    
    

}
