package ex10

/**
 *
 * @author Aluno
 */
public class ponto {
    int x,y;
    
    double calcularDistancia(ponto outroponto){
        int deltaX = x - outroponto.x;
        int deltaY = y - outroponto.y;
        return Math.sqrt(deltaX * deltaX + deltaY + deltaY);
        
    }
    
}
