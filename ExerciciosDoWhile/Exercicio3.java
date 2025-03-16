package ExerciciosDoWhile;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int cont = 11;
        
            System.out.println("Contagem regressiva!");
        
        do{
            
            cont --;
            System.out.println(cont);
            
            try{
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            
        }while(cont >= 1);
        
        
        
    }

}
