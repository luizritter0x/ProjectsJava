package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio13 {
    public static void main(String[] args) {
        // Criar duas listas de inteiros
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);

        HashSet<Integer> uniao = new HashSet<>(lista1);
        uniao.addAll(lista2);
        System.out.println("União das listas:");
        for (int numero : uniao) {
            System.out.println(numero);
        }
    }
}