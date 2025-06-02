

package aula4ex1;

public class main {

    public static void main(String[] args) {
        
        Forma c = new Circulo(20);
        
        
        System.out.println(c.calcularArea());
        
        
        Forma r = new Retangulo(15, 5);
        
        System.out.println(r.calcularArea());
        
        Forma t = new Triangulo(20, 30);
        
        System.out.println(t.calcularArea());
        
    }
    
}
