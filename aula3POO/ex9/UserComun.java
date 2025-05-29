/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9;

/**
 *
 * @author Luiz
 */
public class UserComun implements ContaUser{

    @Override
    public void acessarSistem() {
        System.out.println("Entrando como usuário...");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Acao disponivel somente para usuarios com privilegios de ADM.\n Saindo...");
        
    }
    
    
    
}
