

package aula2ex11;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Televisao t1 = new Televisao(00, 7);
        
        System.out.println("O volume da tv está em: ");
        t1.volume = sc.nextInt();
        System.out.println("Aumente o valor do volume: ");
        System.out.println("Volume aumentado: "+t1.aumentarVolume());
        System.out.println("Diminua o volume: ");
        System.out.println(t1.diminuirVolume());
        
        System.out.println("A TV está no canal "+t1.canal+".");
        System.out.println("Troque o canal: ");
        System.out.println("Canal atual: "+t1.trocarCanal(sc.nextInt()));
        
        
        
    }
    
    

}
