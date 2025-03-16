package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Double> numerosDecimais = new ArrayList<>();
        numerosDecimais.add(10.5);
        numerosDecimais.add(20.75);
        numerosDecimais.add(30.3);
        numerosDecimais.add(40.9);
        numerosDecimais.add(50.1);

        System.out.println("Terceiro elemento: " + numerosDecimais.get(2));
    }
}
