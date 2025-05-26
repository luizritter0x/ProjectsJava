

package aula2ex15empregado;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Empregado e1 = new Empregado("Vitor", 3000.00, "TI");
        
        System.out.println("Informações do funcionário: ");
        System.out.println("Nome: "+e1.nome);
        System.out.println("Salário: "+e1.salario);
        System.out.println("Departamento: "+e1.cargo);
        
        System.out.println("Digite o valor do bônus no formato (0.00)");
        e1.valor = sc.nextDouble();
        
        
        
        System.out.println("O salário com aumento de "+e1.valor+"% fica: "+e1.calcularBonus());
        
        
        
    }
        
        
        
    

}
