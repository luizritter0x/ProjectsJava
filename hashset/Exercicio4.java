package hashset;

import java.util.HashSet;

public class Exercicio4 {
    public static void main(String[] args) {
        HashSet<String> cidades = new HashSet<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        if (cidades.isEmpty()) {
            System.out.println("O conjunto está vazio.");
        } else {
            System.out.println("O conjunto não está vazio.");
        }
    }
}