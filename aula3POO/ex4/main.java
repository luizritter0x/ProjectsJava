/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = sc2.nextInt();
        
        Pessoa p1 = new Pessoa(nome1, idade1);
        
        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = sc2.nextInt();
        
        Pessoa p2 = new Pessoa(nome2, idade2);
        
        int comparacao = p1.compareTo(p2);
        
        if(comparacao < 0){
            System.out.println(p1.getNome()+" é mais novo(a) que "+p2.getNome());
        }else if(comparacao > 0){
            System.out.println(p1.getNome()+" é mais velho(a) que "+p2.getNome());
        }else {
            System.out.println(p1.getNome()+ " tem a mesma idade que "+p2.getNome());
        }
        
        
        
        
    }
    
    
}
