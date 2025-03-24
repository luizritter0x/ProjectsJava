package hashset;

import java.util.HashSet;

public class Exercicio3 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }
        numeros.clear();
        if (numeros.isEmpty()) {
            System.out.println("O conjunto está vazio.");
        } else {
            System.out.println("O conjunto não está vazio.");
        }
    }
}