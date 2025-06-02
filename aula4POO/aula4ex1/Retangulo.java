

package aula4ex1;

public class Retangulo extends Forma{

    double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    

    @Override
    public double calcularArea() {
        
        System.out.println("A área do retângulo é: ");
        
        double area = base * altura;
        
        return area;
    }
    
    
    
    
    
    
}
