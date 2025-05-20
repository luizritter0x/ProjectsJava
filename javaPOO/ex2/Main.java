

package ex2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        Carro carro = new Carro();
        
        System.out.println("Digite a marca do carro.");
        carro.marca = sc.nextLine();
        
        System.out.println("Digite o modelo do carro.");
        carro.modelo = sc.nextLine();
        
        System.out.println("Digite o ano do carro.");
        carro.ano = sc2.nextInt();
        
        carro.ligado = false;
        
        System.out.println("## Informações do carro cadastrado ##");
        System.out.println("Marca: "+carro.marca);
        
        System.out.println("Modelo: "+carro.modelo);
        System.out.println("Ano: "+carro.ano);
         
        
        System.out.println("\n Deseja ligar o carro? (s/n)");
        
        
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("s")){
            carro.ligar();
            System.out.println("Deseja desligar o carro? (s/n)");
            opcao = sc.nextLine();
            if(opcao.equalsIgnoreCase("s")){
                carro.desligar();
            }else{
                System.out.println("O carro continua ligado.");
            }
        }else{
            System.out.println("O carro continua desligado.");
        }
        
        
        
        sc.close();
        
        
        
        
    }
    
    

}
