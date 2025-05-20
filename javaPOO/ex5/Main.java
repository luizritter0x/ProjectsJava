package ex5;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        funcionario func = new funcionario();
        
        System.out.println("Qual o nome do funcionário?");
        func.nome = sc.nextLine();
        
        System.out.println("Qual o departamento no qual o funcionario trabalha? ");
        func.departamento = sc.nextLine();
        
        System.out.println("Qual o salario do funcionario?");
        func.salario = sc2.nextDouble();
        
        //System.out.println("Digite o valor percentual do aumento:");
        //func.numero = sc2.nextDouble();
        
       
        
        System.out.println("Valor do salário com aumento: "+func.aumentarSalario());
        
        
        
    }
    
    
}
