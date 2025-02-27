package ExerciciosJava2;

import java.util.Scanner;

public class ClassificadorDeLogin {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o Seu Login:");
        String login = teclado.nextLine();
        
        if (login.length() >= 6 && !login.contains(" ")) {
            System.out.println("Tudo certo, login feito!");
        }else{
            System.out.println("Inválido!");
        }            
    }
}
