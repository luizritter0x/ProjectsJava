package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double lado3 = scanner.nextDouble();
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }
}