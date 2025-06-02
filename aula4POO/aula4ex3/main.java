package aula4ex3;

import java.util.Scanner;

/**
 *
 * @author Luiz Ritter
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite o nome do gerente: ");
        String nomeGerente = sc.nextLine();

        System.out.println("Digite o salário do gerente: ");
        double salarioGerente = sc.nextDouble();

        Funcionario gerente = new Gerente(nomeGerente, salarioGerente);
        
        sc.nextLine();
        
        

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = sc.nextLine();

        System.out.println("Digite o salário do vendedor: ");
        double salarioVendedor = sc2.nextDouble();
        
        
        
        System.out.println("Digite o número de vendas realizadas: ");
        int vendasVendedor = sc2.nextInt();

        Funcionario vendedor = new Vendedor(nomeVendedor, salarioVendedor, vendasVendedor);
        
        sc.nextLine();
        
        System.out.println("Digite o nome do gerente: ");
        String nomeDev = sc.nextLine();

        System.out.println("Digite o salário do gerente: ");
        double salarioDev = sc2.nextDouble();

        Funcionario dev = new Desenvolvedor(nomeDev, salarioDev);
        
        sc.nextLine();
        
        System.out.println("Bônus do gerente: R$"+gerente.calcularBonus());
        System.out.println("Bônus do vendedor: R$"+vendedor.calcularBonus());
        System.out.println("Bônus do dev: R$"+dev.calcularBonus());
        
        

    }

}
