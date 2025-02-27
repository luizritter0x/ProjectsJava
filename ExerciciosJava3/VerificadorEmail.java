package ExerciciosJava2;

import java.util.Scanner;

public class VerificadorEmail {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um email (com @ e .com)");
        String email = teclado.nextLine();
        
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Certo! email valido!");
        }else {
            System.out.println("Email invalido!");
        }
  
        
    }

}

