/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
         System.out.print("Escolha um animal\n \n(1- Cachorro, 2- Gato):");
         int escolha = sc.nextInt();
         
         Animal animal;
         if (escolha == 1) {
             animal = new Cachorro();
         } else {
             animal = new Gato();
         }
         
         animal.emitirSom();
     }
  }
}
