

package aula2ex6;

/**
 *
 * @author Aluno
 */
public class Retangulo {

    double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    double area;
    
    double calcularArea(){
        
        area = largura * altura;
        
        return area;
    }
    
    double perimetro;
    
    double calcularPerimetro(){
        
        perimetro = 2 * largura * altura;
        
        return perimetro;
    }
    
    
    
}
