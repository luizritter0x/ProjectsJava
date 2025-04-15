package Prova;

import java.util.Scanner;

public class prova20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
            int[] idades = new int [3];
        
            for(int i = 0; i < 3; i++) {
                System.out.println("Nome do cliente: " + (i + 1) + ": ");
                    nomes[i] = sc.nextLine();
                System.out.println("Idade do cliente" + (i + 1) + ": ");
                    idades[i] = sc.nextInt();
                        sc.nextLine();
            }
            System.out.println("Clientes maiores de idade: ");
                for(int i = 0; i < 3; i++) {
                    if (idades[i] >= 18) {
                        System.out.println(nomes[i] + " - " + idades[i] + " anos");
                    }
                }
    }
}
