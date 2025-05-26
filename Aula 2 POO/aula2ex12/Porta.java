package Aula2_Ex12;

/**
 *
 * @author Aluno
 */
public class Porta {

    boolean aberta = false;

    String cor;

    public Porta(String cor) {
        this.cor = cor;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    boolean abrir() {

        return aberta = true;

    }

    boolean fechar() {
        

        return aberta = false;
        
    }

}
