

package aula2ex2e18conta;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {
        
        ContaBancaria c1 = new ContaBancaria(5000, 2500, "Vitor");
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        
        System.out.println("Informações do titular:");
        System.out.println("Nome: "+c1.titular);
        System.out.println("Número da conta: "+c1.numConta);
        System.out.println("Saldo: "+c1.saldo);
        
        
        System.out.println("Deseja sacar ou depositar um valor?");
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("sacar")){
            
            System.out.println("Digite o valor a ser retirado.");
            double valor = sc.nextDouble();
            if(c1.saldo >= valor){
            c1.saldo -= valor;
            }else{
                System.out.println("Valor indísponivel.");
            }
            
            
            sc.close();
            
        }else if(opcao.equalsIgnoreCase("depositar")){
            
            System.out.println("Digite o valor a ser depositado.");
            
            c1.saldo += sc.nextDouble();
            
            sc.close();
        }
        
        System.out.println("Saldo atual: "+c1.saldo);
        
        
        
        
        
    }
    
    
    
}
