package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
               
        System.out.println("Qual o nome do Funcionario?");
        String name = teclado.nextLine();
        
        System.out.println("Digite o seu Salario");
        double salario = teclado.nextDouble();
        
        System.out.println("O nome do funcionario é" +name+ " e o seu salario é " +salario); 
        
    }
    
}
