package ex4;

/**
 *
 * @author Aluno
 */
public class Main {
    
    double raio;
    
    
    double calcularArea(){
        
        double area = Math.PI * raio * raio;
        return area;
    }
    
    double calcularCircunferencia(){
        
        double circunferencia = 2 * Math.PI * raio;
        return circunferencia;
        
    }
    
}
