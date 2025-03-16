package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio9 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(1);

        // Verificar duplicatas usando um HashSet
        HashSet<Integer> set = new HashSet<>(numeros);
        boolean hasDuplicates = set.size() < numeros.size();

        System.out.println("A lista contém duplicatas? " + hasDuplicates);
    }
}