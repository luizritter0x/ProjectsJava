/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8;

/**
 *
 * @author Luiz
 */
public class carro implements veiculo{

    @Override
    public void acelerar() {
        
        System.out.println("O carro está acelerando...");
        
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando...");
    }

    @Override
    public void virar(String direcao) {
        
        System.out.println("O carro vai virar para a "+direcao+"...");
        
        
    }
    
    
    
    
}
