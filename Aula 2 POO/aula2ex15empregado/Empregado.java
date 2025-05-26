

package aula2ex15empregado;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Empregado {
    
    String nome;
    double salario;
    String cargo;
    

    public Empregado(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    Scanner sc = new Scanner(System.in);
    
    double valor;

    double calcularBonus() {

        return salario + (salario * valor);

    }
    
    
    
    
    
    
}
