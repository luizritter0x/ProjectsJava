package ExerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a sua altura (m): ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        int classificacao;
        if (imc < 18.5) {
            classificacao = 1;
        } else if (imc >= 18.5 && imc < 24.9) {
            classificacao = 2;
        } else if (imc >= 25 && imc < 29.9) {
            classificacao = 3;
        } else if (imc >= 30 && imc < 34.9) {
            classificacao = 4;
        } else if (imc >= 35 && imc < 39.9) {
            classificacao = 5;
        } else {
            classificacao = 6;
        }
        
        switch (classificacao) {
            case 1:
                System.out.println("IMC: " + imc + " - Abaixo do peso");
                break;
            case 2:
                System.out.println("IMC: " + imc + " - Peso normal");
                break;
            case 3:
                System.out.println("IMC: " + imc + " - Sobrepeso");
                break;
            case 4:
                System.out.println("IMC: " + imc + " - Obesidade grau 1");
                break;
            case 5:
                System.out.println("IMC: " + imc + " - Obesidade grau 2");
                break;
            case 6:
                System.out.println("IMC: " + imc + " - Obesidade grau 3");
                break;
            default:
                System.out.println("Erro no cálculo do IMC.");
        }
    }
}