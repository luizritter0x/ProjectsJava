

package aula4ex1;

public class Circulo extends Forma{

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
    
    
    
    
    
    
    
    @Override
    public double calcularArea() {
        
        System.out.println("A área do círculo é:");
        double area = Math.PI * (raio * raio);
        
        return area;
    }

}
