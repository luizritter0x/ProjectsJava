package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Exercicio10 {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Elefante");
        animais.add("Leão");

        ArrayList<String> animaisCopiados = new ArrayList<>(animais);

        System.out.println("Novo ArrayList de animais:");
        for (String animal : animaisCopiados) {
            System.out.println(animal);
        }
    }
}