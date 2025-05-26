

package aula2ex10;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Data D1 = new Data(00, 00, 0000);
        
        System.out.println("Digite o dia de hoje: ");
        D1.dia = sc.nextInt();
        System.out.println("Digite o mês atual: ");
        D1.mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        D1.ano = sc.nextInt();
        
        System.out.println("A data formatada é: "+D1.formatarData());
        
        
        
    }
    
    
    
}
