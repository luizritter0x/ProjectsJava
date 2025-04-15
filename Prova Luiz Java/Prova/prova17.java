package Prova;

public class prova17 {
     public static void main(String[] args) {
        
         int[][] matriz = {
             {1, 2, 3},
             {4, 5, 6},
             {7, 8, 8}
         };
         
         int soma = 0;
         for (int i = 0; i < 3; i++) {
             soma += matriz[i][2 - i];
         }
                 System.out.println("Soma da diagonal secundaria:  " +soma);
         
    }
}
