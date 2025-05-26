

package aula2ex11;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Televisao {

    Scanner sc = new Scanner(System.in);
    
    int volume, canal;
    
    

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    
    int aumentarVolume(){
        
        int aumento = sc.nextInt();
        
        int aumentar = volume + aumento;
        
        
        return aumentar;
    }
    
    int diminuirVolume(){
        
        int dim = sc.nextInt();
        
        int diminuir = volume - dim;
        
        
        return diminuir;
    }
    
    int trocarCanal(int novoCanal){
        
        
        return  novoCanal;
        
        
    }
    
    
    
    
    
    
}
