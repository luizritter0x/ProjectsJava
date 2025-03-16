package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio7 {
    public static void main(String[] args) {
        // Adicionar números aleatórios
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(3);
        numeros.add(7);
        numeros.add(5);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);
        numeros.add(6);
        numeros.add(4);
        numeros.add(2);

        // Ordenar a lista em ordem crescente
        Collections.sort(numeros);

        // Imprimir a lista ordenada
        System.out.println("Lista ordenada:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}