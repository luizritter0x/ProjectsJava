/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8;

/**
 *
 * @author Luiz
 */
public class bicicleta implements veiculo{

    @Override
    public void acelerar() {
        System.out.println("O ciclista está pedalando mais rápido...");
    }

    @Override
    public void frear() {
        System.out.println("O ciclista está parando...");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("O ciclista vai virar para a "+direcao+".");
    }
    
}
