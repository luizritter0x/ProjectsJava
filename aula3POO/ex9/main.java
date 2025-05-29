/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9;

import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        UserComun UC = new UserComun();
        Admin ADM = new Admin();
        System.out.println("Entrar como usuario ou admin?");
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("usuario")){
            UC.acessarSistem();
            System.out.println("Testando os privilegios da conta...");
            UC.realizarOperacao();
            
        }else if(opcao.equalsIgnoreCase("admin")){
            ADM.acessarSistem();
            System.out.println("Testando os privilegios da conta...");
            ADM.realizarOperacao();
        }
        
        
        
    }
}
