package Prova;

import java.util.Arrays;
import java.util.Scanner;

public class prova23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int[] valores = new int[8];
            
            for(int i = 0; i < 3; i++) {
                System.out.println("Digite o valor: " + (i + 1) + ": ");
                valores[i] = sc.nextInt();
            }
            Arrays.sort(valores);
            System.out.println("Segundo maior valor: " +valores[6]);
            sc.close();
    }
}
