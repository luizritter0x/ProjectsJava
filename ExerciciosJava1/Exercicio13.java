package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual a primeira nota do aluno?");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Qual a segunda nota do aluno?");
        double nota2 = teclado.nextDouble();
        
        double media = (nota1+nota2)/2;
        
        if (media >= 7) {
            System.out.println("O aluno teve a media " +media+ " e foi aprovado.");
        }else{
            System.out.println("O aluno foi reprovado.");
        }
    }
}
