package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Exercicio8 {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Argentina");
        paises.add("Chile");
        paises.add("Uruguai");
        paises.add("Paraguai");

        System.out.println("Países na lista:");
        for (int i = 0; i < paises.size(); i++) {
            System.out.println(paises.get(i));
        }
    }
}