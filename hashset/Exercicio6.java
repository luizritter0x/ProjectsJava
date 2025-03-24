package hashset;

import java.util.HashSet;

public class Exercicio6 {
    public static void main(String[] args) {
        HashSet<String> animais = new HashSet<>();
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Elefante");
        if (animais.contains("Leão")) {
            System.out.println("O Leão está presente no conjunto.");
        } else {
            System.out.println("O Leão não está presente no conjunto.");
        }
    }
}