

package aula2ex9;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario("Vitor", 3000.00, "TI");
        
        System.out.println("Informações do funcionário: ");
        System.out.println("Nome: "+f1.nome);
        System.out.println("Salário: "+f1.salario);
        System.out.println("Departamento: "+f1.departamento);
        
        
        
        System.out.println("O salário com aumento de 10% fica: "+f1.aumentarSalario());
        
        
        
    }
    
    
}
