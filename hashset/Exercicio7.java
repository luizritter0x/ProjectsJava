package hashset;

import java.util.HashSet;

public class Exercicio7 {
    public static void main(String[] args) {
        HashSet<String> cores = new HashSet<>();
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        if (cores.contains("Vermelho")) {
            System.out.println("A cor 'Vermelho' está presente no conjunto.");
        } else {
            System.out.println("A cor 'Vermelho' não está presente no conjunto.");
        }
    }
}