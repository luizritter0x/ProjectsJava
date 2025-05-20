/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8;

/**
 *
 * @author Vitor
 */
public class Main {
    
    String nome;
    double preco;
    int quantEmEstoque;
    
    
    int vender(int quantidade){
        
       
        
        
        int venda = quantEmEstoque - quantidade;
        
        
        
       return venda; 
    }
    
    int reporEstoque(int quantidade){
        
        int repor = quantEmEstoque + quantidade;
        return repor;
    }
    
    
    
    
}
