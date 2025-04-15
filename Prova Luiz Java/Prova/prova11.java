package Prova;

import java.util.Scanner;

public class prova11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        
        if (ehQuadradoPerfeito(numero)) {
            System.out.println("é um quadrado perfeito.");
        } else {
            System.out.println("nao eh um quadrado perfeito");
        }
        sc.close();
    }
    public static boolean ehQuadradoPerfeito(int n) {
        double raiz = Math.sqrt(n);
        return raiz * raiz == n;
    }
}
