package Prova;

import java.util.Scanner;

public class prova29 {
        public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite uma string: ");
            
            String texto = sc.nextLine();
            int count = 0;
            
            for(int i = 0; i < texto.length(); i++) {
                if(Character.isDigit(texto.charAt(i))); {
                      count++;
                }
            }
                System.out.println("Quantidade de digitos:" +count);
                sc.close();
    }
}
