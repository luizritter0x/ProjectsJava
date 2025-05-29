/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author Luiz
 */
public class Circulo implements figuraGeometrica {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    

    @Override
    public double calcularArea() {
        
        return (raio * raio) * Math.PI;
        
        
    }

    @Override
    public double calcularPerimetro() {
        return raio * Math.PI * 2;
    }
    
    
    
}
