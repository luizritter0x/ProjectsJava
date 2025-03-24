package hashset;

import java.util.HashSet;

public class Exercicio2 {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.remove("Banana");
        System.out.println("Frutas após remoção: " + frutas);
    }
}