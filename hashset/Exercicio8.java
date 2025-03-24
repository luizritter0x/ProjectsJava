package hashset;

import java.util.HashSet;

public class Exercicio8 {
    public static void main(String[] args) {
        HashSet<String> cidades = new HashSet<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.remove("São Paulo");
        System.out.println("Cidades após remoção: " + cidades);
    }
}