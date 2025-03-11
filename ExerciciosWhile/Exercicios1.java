package ExerciciosWhile;

import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        System.out.print("Digite a idade do aluno (valor negativo para encerrar): ");
        int idade = teclado.nextInt();

        while (idade >= 0) {
            soma += idade;
            contador++;
            System.out.print("Digite a idade do aluno (valor negativo para encerrar): ");
            idade = teclado.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("A média de idade da turma é: %.2f\n", media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
        
        teclado.close();
    }
}