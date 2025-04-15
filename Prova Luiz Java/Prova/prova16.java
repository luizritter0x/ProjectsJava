package Prova;

import java.util.Scanner;

public class prova16 {
        public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            
            String[] nomes = new String[3];
            double[] precos = new double[3];
                for (int i = 0; i < 3; i++) {
                    System.out.println("Nome Do Produto " + (i + 1) + ": ");
                    nomes[i] = sc.nextLine();
                    System.out.println("Preço do produto " + (i + 1) + ": ");
                    precos[i] = sc.nextDouble();
                        sc.nextLine();
                }
            System.out.println("Produtos com desconto (preço < 50): ");
                for (int i = 0; i < 3; i++) {
                    if (precos[i] < 50) {
                        System.out.println(nomes[i] + " - R$ " + precos[i]);
                    }
                }
    }
}
