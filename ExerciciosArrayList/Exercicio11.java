package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio11 {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("João");
        lista1.add("Maria");
        lista1.add("José");
        lista1.add("Ana");
        lista1.add("Carlos");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Ana");
        lista2.add("Carlos");
        lista2.add("Lucas");
        lista2.add("Mariana");
        lista2.add("José");

        HashSet<String> interseccao = new HashSet<>(lista1);
        interseccao.retainAll(lista2);

        System.out.println("Interseção das listas:");
        for (String nome : interseccao) {
            System.out.println(nome);
        }
    }
}