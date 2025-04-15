package Prova;

import java.util.Scanner;

public class prova13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        
            if (temJava(frase)) {
                System.out.println("Tem a palavra java");
            } else {
                System.out.println("Nao tem a palavra java");
            }
    }
            public static boolean
                    temJava(String frase) {
                        return
                                frase.toLowerCase().contains("java");
                    }
}
