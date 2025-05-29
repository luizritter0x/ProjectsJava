/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author Luiz
 */
public class FuncionarioAssalariado implements Pagavel {
    
    String nome;
    String cargo;
    int dias;
    double salario;

    public FuncionarioAssalariado(String nome, String cargo, int dias, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.dias = dias;
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        
        return dias * salario;
        
    }
    
    
}
