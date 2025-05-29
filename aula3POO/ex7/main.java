/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        CartaoCredito cc = new CartaoCredito();
        Dinheiro d = new Dinheiro();
        Boleto b = new Boleto();
        
        System.out.println("Voçê tem contas a pagar!\n Digite a forma de pagamento (cartao/boleto/dinheiro)");
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("cartao")){
            
            cc.efetuarPagamento(0);
            
        }else if(opcao.equalsIgnoreCase("boleto")){
            
            b.efetuarPagamento(0);
        }else if(opcao.equalsIgnoreCase("dinheiro")){
            
            d.efetuarPagamento(0);
            
        }else{
            System.out.println("Forma de pagamento indisponivel.");
        }
        
        
        
    }
    
}
