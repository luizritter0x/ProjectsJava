package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite quantos dias o cupincha trabalhou");
        double diasTrabalhados = teclado.nextDouble();       
        
        int horasTrabalhadas = 8;
        int valorPorHora = 25;
        
        double salarioFinal = horasTrabalhadas * valorPorHora * diasTrabalhados;
        
        System.out.println("O novo salario do cupincha é: " +salarioFinal);
    
    }
    
}
