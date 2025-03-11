package ExercicioSemCalculos;

import java.util.Scanner;

public class VerificadordeNome {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        
        if (nome.length() > 5){
            System.out.println("Seu nome tem mais de 5 caracteres");
        }else{
            System.out.println("Seu nome não tem mais de 5 caracteres");
        }    
    }

}
