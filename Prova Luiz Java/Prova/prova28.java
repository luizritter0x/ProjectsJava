package Prova;

import java.util.Scanner;

public class prova28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        int soma = 0;
        
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                
                matriz[i][j] = sc.nextInt();
                    
                    for(int i = 0; i < 3; i++)
                        for(int j = i + 1; j < 3; j++)
                            soma += matriz[i][j] = sc.nextInt();
                    
        System.out.println("Soma: " +soma);    
    }
}
