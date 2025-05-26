package aula2ex7;

/**
 *
 * @author Aluno
 */
public class Circulo {

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        double area = Math.PI * raio * raio;
        return area;

    }

    public double calcularCircunferencia() {
        double circunferencia = 2 * Math.PI * raio;
        return circunferencia;

    }

}
