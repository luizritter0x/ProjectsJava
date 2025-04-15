package Prova;

import java.util.Scanner;

public class prova15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] palavras = new String[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite uma palavra: ");
                palavras[i] = sc.nextLine();
            }
            System.out.println("Palavras que contem a letra E: ");
                for (String palavra : palavras) {
                    if (palavra.toLowerCase().contains("e")) {
                        System.out.println(palavra);
                    }
                }
        }
}
