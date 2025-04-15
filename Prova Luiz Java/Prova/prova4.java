package Prova;

import java.util.Scanner;

public class prova4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Digite uma frase");
        
        String frase = sc.nextLine();
        
        String[] palavras = frase.split(" ");
            int count = 0;
        
            for(String p : palavras)
                if(p.length() > 4)count++;
            
        System.out.println("Palavras com mais de 4 letras: " +count);           
    }
}
