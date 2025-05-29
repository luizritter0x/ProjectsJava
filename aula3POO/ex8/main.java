/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8;

import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class main {

    public static void main(String[] args) {
        carro car = new carro();
        moto mot = new moto();
        bicicleta bike = new bicicleta();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual veículo voçê quer testar? (carro/moto/bicicleta)");
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("carro")){
            car.acelerar();
            car.frear();
            System.out.println("Virar para qual direcao?");
            String opcao2 = sc.nextLine();
            car.virar(opcao2);
            
        }else if(opcao.equalsIgnoreCase("moto")){
            mot.acelerar();
            mot.frear();
            System.out.println("Virar para qual direcao?");
            String opcao2 = sc.nextLine();
            mot.virar(opcao2);
        }else if(opcao.equalsIgnoreCase("bicicleta")){
            bike.acelerar();
            bike.frear();
            System.out.println("Virar para qual direcao?");
            String opcao2 = sc.nextLine();
            bike.virar(opcao2);
        }
        
        
    }

}
