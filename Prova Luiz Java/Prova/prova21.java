package Prova;

import java.util.Random;

public class prova21 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        gerarNumeros(numeros);      
        multiplosDe4(numeros);
    }    
        public static void gerarNumeros(int[] numeros) {
            Random rand = new Random();
                for(int i = 0; i < numeros.length; i++) {
                    numeros[i] = rand.nextInt(100) + 1;
                    
                    System.out.println(numeros[i] + " ");    
                }
                    System.out.println();
                }
        public static void multiplosDe4(int[] numeros) {        
            for(int n : numeros) {
                if (n % 4 == 0) {
                    System.out.println("");
                }
            }
                
    }
}
