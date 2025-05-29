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
public class Boleto implements formaPagamento{

    @Override
    public void efetuarPagamento(double valor) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor a ser pago: ");
        valor = sc.nextDouble();
        
        System.out.println("Pagamento do boleto no valor de "+valor+" efetudado com sucesso.");
        
        
        
    }
    
    
    
    
    
}
