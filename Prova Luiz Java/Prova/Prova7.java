package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prova7 {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> impares = new ArrayList<>();
        
        System.out.println("Digite 10 numeros: ");
            for(int i = 0; i < 10; i++) 
            {
                int num = sc.nextInt();
                if (num % 2 != 0) {
                    impares.add(num);
                }
            }
            Collections.reverse(impares);
                System.out.println("Impares em ordem reversa: " +impares);
    }
}
