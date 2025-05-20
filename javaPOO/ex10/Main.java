package ex10

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ponto ponto1 = new ponto();
        ponto ponto2 = new ponto();
        
        System.out.println("Digite as coordenadas do primeiro ponto: ");
        System.out.print("x:");
        ponto1.x = sc.nextInt();
        System.out.print("y:");
        ponto1.y = sc.nextInt();
        
        System.out.println("Digite as coordenadas do segundo ponto: ");
        System.out.print("x:");
        ponto2.x = sc.nextInt();
        System.out.print("y:");
        ponto2.y = sc.nextInt();
        
        //Calcular e exbibir a distancia
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("A distancia dos pontos é: "+distancia);
        
    }
}
