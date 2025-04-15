package Prova;

import java.util.Scanner;

public class prova38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
                if (num >= 20 && num <= 70) count++;
        }
            System.out.println("Numeros entre 20 e 70: " +count);       
    }           
}
