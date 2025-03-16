package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");

        System.out.println("Contém 'Amarelo'? " + cores.contains("Amarelo"));
    }
}