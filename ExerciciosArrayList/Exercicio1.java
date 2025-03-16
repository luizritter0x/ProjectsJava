package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {
        // Adicionar e imprimir cidades
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Porto Alegre");
        cidades.add("Curitiba");

        System.out.println("Cidades na lista:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
