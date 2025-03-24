package hashset;

import java.util.HashSet;

public class Exercicio10 {
    public static void main(String[] args) {
        HashSet<String> animais = new HashSet<>();
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Elefante");
        System.out.println("Animais no conjunto:");
        for (String animal : animais) {
            System.out.println(animal);
        }
    }
}