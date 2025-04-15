package Prova;

import java.util.Scanner;

public class prova5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[6];
        int count = 0;
        
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade" + (i+1) + "; ");
            idades[i] = sc.nextInt();
                        if (idades[i] >= 18 && idades[i] <= 30) count++;
         
            System.out.println("Pessoa entre 18 e 30 anos: " +count);
        }    
    }
}
