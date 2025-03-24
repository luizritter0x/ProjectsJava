package hashset;

import java.util.HashSet;

public class Exercicio9 {
    public static void main(String[] args) {
        HashSet<Character> alfabeto = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alfabeto.add(c);
        }
        System.out.println("Tamanho do HashSet: " + alfabeto.size());
    }
}