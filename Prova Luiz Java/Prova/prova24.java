package Prova;

import java.util.Scanner;

public class prova24 {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String texto = sc.nextLine();
        
        String alterado = texto.replaceAll("[AEIOUaeiou]", "*");
        
        System.out.println("Frase alterada: " +alterado);
            sc.close();
    }
}
