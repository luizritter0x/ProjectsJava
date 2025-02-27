package ExerciciosJava2;

import java.util.Scanner;

public class SubsTexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma frase que tenha java no meio");
        String frase = teclado.nextLine();
        
        String novaFrase = frase.replace("Java", "Programação");
        System.out.println(novaFrase);
        
    }

}
