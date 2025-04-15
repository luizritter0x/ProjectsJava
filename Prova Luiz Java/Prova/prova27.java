package Prova;

import java.util.Scanner;

public class prova27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frutas = new String[6];
        
            for(int i = 0; i < 6; i++) {
                System.out.println("digite uma fruta: ");
                frutas[i] = sc.nextLine();
            }
            
            System.out.println("Frutas que comecam com vogal: ");
                for(String fruta : frutas) {
                    char primeiraLetra = fruta.toLowerCase().charAt(0);
                        if ("aeiou".indexOf(primeiraLetra) != -1) {
                            System.out.println(fruta);
                        }
                }
    }
}
