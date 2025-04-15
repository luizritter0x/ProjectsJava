package Prova;

import java.util.Scanner;

public class prova19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
            String frase = sc.nextLine();
            
            int total = contarPalavras(frase);
            System.out.println("A palavra contem: " + total +" palavras");
    }
            public static int contarPalavras(String frase) {
                String[] palavras = frase.trim().split("\\s");
                    return palavras.length;      
    }
}
