/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9;

/**
 *
 * @author Luiz
 */
public class Admin implements ContaUser{

    @Override
    public void acessarSistem() {
        System.out.println("Entrando como admin...");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Privilégios de ADM reconhecidos.\n Realizando acao...");
    }
    
}
