package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio4 {   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a distancia em metros");
        double numMetros = teclado.nextDouble();
        double convKm = numMetros / 1000;
        double convCm = numMetros * 100;
        
        System.out.println("A distancia em km é: " +convKm);
        System.out.println("A distancia em cm é; " +convCm);       
    }
    
}
