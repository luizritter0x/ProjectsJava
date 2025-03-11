package ExerciciosLacoFor;

import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numero = random.nextInt(100) + 1; // Gera número aleatório entre 1 e 100
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        for (tentativas = 1; tentativas <= 7; tentativas++) {
            System.out.print("Tentativa " + tentativas + ": ");
            palpite = scanner.nextInt();

            if (palpite == numero) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break; // Sai do laço se acertar o número
            } else if (palpite < numero) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
        }

        if (palpite != numero) {
            System.out.println("Você não conseguiu adivinhar o número. O número era " + numero);
        }
        scanner.close();
    }
}
