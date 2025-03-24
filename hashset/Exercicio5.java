package hashset;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        HashSet<String> cores = new HashSet<>();
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        List<String> listaDeCores = new ArrayList<>(cores);
        System.out.println("Cores: " + listaDeCores);
    }
}