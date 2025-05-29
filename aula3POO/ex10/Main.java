/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.print("Quantos números deseja ordenar?");
        int n = scanner.nextInt();
        
        System.out.print("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros.add(scanner.nextInt());
        }
        
        Ordenacao<Integer> ordenador = new Crescente();
        ordenador.ordenar(numeros);
        
        System.out.println("Números ordenados: " + numeros);
    }
}
