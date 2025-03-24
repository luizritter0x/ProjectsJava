package hashset;

import java.util.HashSet;

public class Exercicio1 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        if (numeros.contains(5)) {
            System.out.println("O número 5 está presente no conjunto.");
        } else {
            System.out.println("O número 5 não está presente no conjunto.");
        }
    }
}