package ExerciciosWhile;

import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a senha: ");
        String senha = teclado.next();

        while (!senha.equals("1234")) {
            System.out.println("Senha incorreta! Tente novamente.");
            System.out.print("Digite a senha: ");
            senha = teclado.next();
        }
        
        System.out.println("Senha correta! Acesso liberado.");
        teclado.close();
    }
}