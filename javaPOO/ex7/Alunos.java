/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

/**
 *
 * @author Vitor
 */
public class Main {

    String nome;
    int matricula;

    double[] notas = {8, 8, 7.5};

    double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {

            soma += nota;

        }
        return soma / notas.length;

    }

}
