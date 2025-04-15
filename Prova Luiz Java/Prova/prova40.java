package Prova;

import java.util.Scanner;

public class prova40 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase;
        String fraseMaisLonga = "";
        
        while (true) {
            System.out.println("Digite uma frase ou sair para sair");
            frase = sc.nextLine();
            
            if(frase.equalsIgnoreCase("sair")) {
                break;
            }
            if (frase.length() > fraseMaisLonga.length()) {
                fraseMaisLonga = frase;
            }
        }
        System.out.println("A frase mais longa é: " +fraseMaisLonga);
        sc.close();
    }
            
}
