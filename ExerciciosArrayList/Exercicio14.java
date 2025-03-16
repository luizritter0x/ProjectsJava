package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Exercicio14 {
    public static void main(String[] args) {
        // Criar lista de palavras
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("abacaxi");
        palavras.add("banana");
        palavras.add("goiaba");
        palavras.add("kiwi");
        palavras.add("maçã");
        palavras.add("laranja");
        palavras.add("manga");
        palavras.add("morango");
        palavras.add("pera");
        palavras.add("uva");

        // Filtrar palavras com mais de 5 caracteres
        ArrayList<String> filtradas = (ArrayList<String>) palavras.stream()
                                              .filter(p -> p.length() > 5)
                                              .collect(Collectors.toList());

        // Imprimir palavras filtradas
        System.out.println("Palavras com mais de 5 caracteres:");
        for (String palavra : filtradas) {
            System.out.println(palavra);
        }
    }
}