/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author Luiz
 */
public class FuncionarioHorista implements Pagavel{
    
    String nome, cargo;
    double horas, salario;

    public FuncionarioHorista(String nome, String cargo, double horas, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.horas = horas;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        
        return horas * salario;
        
        
    }
    
    
    
    
    
    
}
