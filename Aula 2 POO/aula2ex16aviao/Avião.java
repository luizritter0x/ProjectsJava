

package aula2ex16aviao;

/**
 *
 * @author Aluno
 */
public class Avião {
    
    String modelo;
    int capPassageiros;
    double velMaxima;

    public Avião(String modelo, int capPassageiros, double velMaxima) {
        this.modelo = modelo;
        this.capPassageiros = capPassageiros;
        this.velMaxima = velMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapPassageiros() {
        return capPassageiros;
    }

    public void setCapPassageiros(int capPassageiros) {
        this.capPassageiros = capPassageiros;
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }
    
    
    
    
    

}
