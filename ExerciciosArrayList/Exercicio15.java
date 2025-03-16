package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Exercicio15 {
    public static void main(String[] args) {
        // Criar lista de palavras
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("cachorro");
        palavras.add("gato");
        palavras.add("elefante");
        palavras.add("leão");
        palavras.add("tigre");
        palavras.add("urso");

        // Reverter a lista sem usar bibliotecas auxiliares
        ArrayList<String> listaRevertida = new ArrayList<>();
        for (int i = palavras.size() - 1; i >= 0; i--) {
            listaRevertida.add(palavras.get(i));
        }

        // Imprimir a lista revertida
        System.out.println("Lista revertida:");
        for (String palavra : listaRevertida) {
            System.out.println(palavra);
        }
    }
}