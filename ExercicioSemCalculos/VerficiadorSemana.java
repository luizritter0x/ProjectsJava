package ExercicioSemCalculos;

import java.util.Scanner;

public class VerficiadorSemana {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Digite um dia da semana");
        String dia = teclado.nextLine();
        
        if (dia.equals("Sabado") || (dia.equals("Domingo"))){
            System.out.println("Fim de semana!");
        }else if ((dia.equals("Segunda")) || (dia.equals("Sexta")) || (dia.equals("Terça")) || (dia.equals("Quarta")) || (dia.equals("Quinta"))) {
            System.out.println("Dia de semana");
        } 
    }
}
