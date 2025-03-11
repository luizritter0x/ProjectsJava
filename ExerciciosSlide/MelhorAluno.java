package ExerciciosSlide;

import java.util.Scanner;

public class MelhorAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ESCOLA SÓ DE GÊNIOS");
        System.out.println("--------------------");
        System.out.print("Quantos alunos tem na turma? ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
        
        String melhorAluno = "";
        double maiorNota = 0.0;
        
        for (int contador = 1; contador <= numAlunos; contador++) {
            System.out.println("--------------------");
            System.out.println("ALUNO " + contador);
            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Nota de " + nome + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Consome a quebra de linha
            
            if (nota > maiorNota) {
                maiorNota = nota;
                melhorAluno = nome;
            }
        }
        
        System.out.println("--------------------");
        System.out.printf("O melhor aproveitamento foi de %s com a nota %.2f%n", melhorAluno, maiorNota);
        scanner.close();
    }
}
