

package aula4ex1;

public class Triangulo extends Forma{

    double altura, base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        
        System.out.println("A área do triângulo é: ");
        double area = (base * base)/2;
        return area;
        
        
    }
    
    
    
    
}
